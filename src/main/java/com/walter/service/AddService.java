package com.walter.service;

import com.walter.service.interfaces.IAddService;
import org.springframework.stereotype.Service;

@Service
public class AddService implements IAddService {
    @Override
    public String add(String name, String phone) {
        return name.concat(" ").concat(phone);
    }
}
