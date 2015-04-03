package com.test.rest;

import com.test.core.Mensaje;

public class MensajeController {
	
	
	public Mensaje consultarMensaje(){
		return new Mensaje("Hello World");
	}

}
