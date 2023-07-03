package com.icodeap.tradekeeper;

import com.icodeap.tradekeeper.model.Supplier;
import com.icodeap.tradekeeper.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradekeeperApplication {


	public static void main(String[] args) {
		SpringApplication.run(TradekeeperApplication.class, args);
		Supplier supplier = Supplier.builder().name("name_1").country("españa").build();
	}

}
