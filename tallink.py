# coding=UTF8

# Autor: Karl Erik Õunapuu
# Kuupäev: 19.10.2016
# Kerge web scratcher. Kontrollib kas Tallinki Tallinn - Stockholm kruiisil on äkki kajuti hinnad alla läinud

import urllib2
from bs4 import BeautifulSoup
from selenium import webdriver
import time
import datetime

#Tallinki otsingu URL
query = 'https://booking.tallink.com/?voyageType=SHUTTLE&eveningDeparture=true&withVehicle=false&from=tal&to=sto&adults=4&children=0&juniors=0&youths=0&date=2016-10-28&locale=et&country=EE&marketUntilDate=2017-12-22&_ga=1.98495196.218069809.1475764556'

#Valjumiskuupaev
date = "2016-10-28"

#Millisest summast peab hind vaiksem olema
price = 136

#Kontrollimise intervall minutites
interval = 5

def checkPrice(query, date, price):
	render = webdriver.PhantomJS()
	render.get(query)
	time.sleep(2)
	html_source = render.page_source
	render.quit()

	parser = BeautifulSoup(html_source, 'html.parser')

	for hit in parser.findAll(attrs={'datetime' : date}):
		parser = BeautifulSoup(str(hit), 'html.parser')
		hind = parser.find(attrs={'class' : 'price'}).text

		if(int(hind.split(" ")[0]) < price):
			print("\033[91m [" + str(datetime.datetime.now()) + "] - Hind: " + str(hind.split(" ")[0]) + "€ - hind soodsam!")
		else:
			print(" \033[93m [" + str(datetime.datetime.now()) + "] - Hind: " + str(hind.split(" ")[0]) + "€")

while(1):
	checkPrice(query, date, price)
	print("\033[90mOotan intervalli...");
	time.sleep(60*interval)
