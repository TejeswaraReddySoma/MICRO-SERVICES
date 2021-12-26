package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable> {

	@Query("select companyStockPrice from StockPrice where companyName=:companyName")
	public Double findStockPriceByCompanyName(String companyName);

}