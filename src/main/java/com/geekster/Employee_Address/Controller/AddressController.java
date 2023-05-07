package com.geekster.Employee_Address.Controller;
import com.geekster.Employee_Address.Model.Address;
import com.geekster.Employee_Address.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;
    @GetMapping
    public List<Address> getAllAddresses() {
        return (List<Address>) addressRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id) {
        Optional<Address> address = addressRepository.findById(id);
        return address.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = "application/json")
    public Address createAddress(@RequestBody Address address) {
        return addressRepository.save(address);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id, @RequestBody Address addressDetails) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if (optionalAddress.isPresent()) {
            Address address = optionalAddress.get();
            address.setStreet(addressDetails.getStreet());
            address.setCity(addressDetails.getCity());
            address.setState(addressDetails.getState());
            address.setZipcode(addressDetails.getZipcode());
            addressRepository.save(address);
            return ResponseEntity.ok(address);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            addressRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
