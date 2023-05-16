package com.loginext.AddressApp.Service;

import com.loginext.AddressApp.Dao.AddressDao;

import com.loginext.AddressApp.Model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AddressServicesImpl implements AddressServices{

    @Autowired
    private AddressDao addressDao;
    @Override
    public void Add(String addressInput) {
        addressDao.save(stringToAddress(addressInput));

    }
    public Address stringToAddress(String addressInput)
    {
        String[] addressInArray = addressInput.split(",");
        Address address = new Address();

        address.setHouse(addressInArray[0]);
        address.setLocality(addressInArray[1]);
        address.setLandmark(addressInArray[2]);
        address.setArea(addressInArray[3]);
        address.setCity(addressInArray[4]);
        address.setState(addressInArray[5]);
        address.setCountry(addressInArray[6]);
        address.setPinCode(addressInArray[7]);

        return address;

    }
}
