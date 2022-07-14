package com.Electronic.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElectronicDevicesApplication {

	@Autowired
	private DeviceRepository deviceRepository;
	@PostMapping("/electrodevice")
	public Electrodevices addElectrodevices(@RequestBody Electrodevices electrodevices) {
		return deviceRepository.save(electrodevices);
	}
	@GetMapping("/electrodevices")
	public List<Electrodevices>getElectrodevices(){
		return deviceRepository.findAll();
		}
	public static void main(String[] args) {
		SpringApplication.run(ElectronicDevicesApplication.class, args);
	}

}
