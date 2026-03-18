package br.com.fiap.winery;

public class WineStockServiceImplementation implements WineStockService{

    @Override
    public String getMenu(){
        return """
            ===== CARDÁPIO DE VINHOS =====
            Cabernet Sauvignon - Tinto
            Merlot - Tinto
            Pinot Noir - Tinto
            Chardonnay - Branco
            Sauvignon Blanc - Branco
            Syrah - Tinto
            Malbec - Tinto
            """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "";
    }


}
