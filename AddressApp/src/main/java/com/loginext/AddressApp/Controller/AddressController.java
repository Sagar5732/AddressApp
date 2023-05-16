package com.loginext.AddressApp.Controller;

import com.loginext.AddressApp.Service.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressServices addressServices;

    @PostMapping(value = "/address/addAddress" )
    public String addAddress(@RequestBody String addressInput)
    {
        addressServices.Add(addressInput);
        return "Success";
    }
}
