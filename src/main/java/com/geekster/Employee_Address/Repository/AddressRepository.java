package com.geekster.Employee_Address.Repository;
import com.geekster.Employee_Address.Model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
