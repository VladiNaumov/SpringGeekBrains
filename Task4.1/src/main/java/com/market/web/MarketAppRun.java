package com.market.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketAppRun {

	public static void main(String[] args) {


		/*

		base url
		http://localhost:8189/market/hello
		http://localhost:8189/market/product
		http://localhost:8189/market/product/remove_id/5
		http://localhost:8189/market/product/5
		http://localhost:8189/market/product/remove_all


		 */

		SpringApplication.run(MarketAppRun.class, args);
	}
}
