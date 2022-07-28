#!/bin/bash/

blue='\e[1;38;5;27m'
red='\e[1;38;5;160m'
green='\e[1;38;5;46m'
NC='\e[0m'

echo -e "${blue}Vamos a comprobar si tienes conexion a internet:${NC}";
sudo apt-get install netcat
sleep 5s;
    if netcat -z google.com 80 &>/dev/null; then
        echo -e "${green}Tienes conexión, iniciando la instalaci  n...${NC}";
        sleep 3s;

        echo -e "${blue}Actualizando el sistema...${NC}";
        sudo apt-get update
        sudo apt upgrade -y
        echo -e "${blue}Instalando JDK y JRE en el sistema...${NC}";
        sudo apt-get install default-jdk
        echo -e "${blue}version de java Instalada${NC}";
        java -version
     else
        echo -e "${red}No tienes conexión para instalar correctamente los modulos${NC}";
        sleep 3s;

        echo -e "${blue}Cerrando Script automaticamante${NC}";
        sleep 3s;
        clear;
    fi