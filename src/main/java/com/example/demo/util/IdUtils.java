package com.example.demo.util;


import java.util.UUID;

public class IdUtils {
	public String getId(){

        UUID uuid=UUID.randomUUID();
        String uuidStr=uuid.toString();
        return uuidStr;

}
	
}
