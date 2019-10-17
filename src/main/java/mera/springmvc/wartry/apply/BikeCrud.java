package mera.springmvc.wartry.apply;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface BikeCrud extends CrudRepository<Bike, Integer>{
	
}
