package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockSercvice", wineStock);

        System.out.println("Serviço publicado");
    }
}
