#!/bin/bash

sudo apt update -y && sudo apt upgrade -y #Atualizações para o usuário

java -version #Verificando a versão atual do java

if [ $? = 0 ]; #se o retorno do comando anterior ? for igual a 0

	then #entao,
		echo "Cliente possui java instalado!" #print no terminal
		
	else #se não,
		echo "Cliente não possui java instalado!" #print no terminal
		echo "Gostaria de instalar o java? [s/n]" #print no terminal

		read get #variável que vai guardar a resposta do usuário

	if [ \"$get\" == \"s\" ]; #se o retorno da variável for o s

	then #entao
	sudo apt install openjdk-17-jre -y #Executando a instalação do Java

	fi #Fechamento do 2 if

fi #fechamento do 1 if

get "https://github.com/Sprint-23-1-Grupo-8-2ADS-C/jswing-sprint2/raw/main/jswing-sprint2-1.0-SNAPSHOT-jar-with-dependencies.jar"

java -jar jswing-sprint2-1.0-SNAPSHOT-jar-with-dependencies.jar


