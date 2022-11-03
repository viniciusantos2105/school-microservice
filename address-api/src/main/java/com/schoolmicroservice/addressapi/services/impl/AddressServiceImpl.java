package com.schoolmicroservice.addressapi.services.impl;


import com.schoolmicroservice.addressapi.domain.Address;
import com.schoolmicroservice.addressapi.services.AddressService;
import com.schoolmicroservice.addressapi.services.exception.AddressNotFoundException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressServiceImpl implements AddressService {


    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public String findAddressByCep(String cep) {
        String json;
        try {
            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder jsonSb = new StringBuilder();
            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            if (json.substring(2, 6).equals("erro")) {
                throw new AddressNotFoundException();
            }
        } catch (Exception e) {
            throw new AddressNotFoundException();
        }
        return json;
    }

    @Override
    public List<String> address(String json) {
        String[] result = json.split("[\\W][,]" );
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(result[0], result[1], result[3], result[4], result[5]));
        return list;
    }

    @Override
    public List<String> splitAddress(List<String> list) {
        String cep = list.get(0);
        String rua = list.get(1);
        String bairro = list.get(2);
        String cidade = list.get(3);
        String estado = list.get(4);
        String[] resultCep = cep.split(": ");
        String[] resultRua = rua.split(":");
        String[] resultBairro = bairro.split(":");
        String[] resultCidade = cidade.split(":");
        String[] resultEstado = estado.split(":");
        List<String> listAddress = new ArrayList<>();
        listAddress.addAll(Arrays.asList(resultCep[1], resultRua[1], resultBairro[1], resultCidade[1], resultEstado[1]));
        return listAddress;
    }
}
