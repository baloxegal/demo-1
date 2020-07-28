package services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.Client;

@Service
public class ClientServices {
	
	public ClientServices() {
		
	}
	
	public List<Client> getClients(){
		
		List<Client> clients = new ArrayList<>();
		
		return clients;
	}

}
