package in.ashokit.service;

import in.ashokit.bindings.StockPriceResponse;

public interface StockPriceService {

	public StockPriceResponse getStockPrice(String companyName);

}
