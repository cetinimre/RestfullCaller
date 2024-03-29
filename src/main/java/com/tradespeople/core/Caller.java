package com.tradespeople.core;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Caller {

	public static void main(String[] args) {

		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/tradespeople-web/restful/userrole/update/1/2/3");
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		String output = response.getEntity(String.class);

		System.out.println("Output from Server .... \n");
		System.out.println(output);
	}

}
