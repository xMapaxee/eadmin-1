package es.fpdual.eadmin.eadmin.modelo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DocumentoTest {

	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean PUBLICO = true;

	

	@Test
	public final void testHashCode() {
		Documento prueba = new Documento(CODIGO,NOMBRE,FECHA_CREACION,PUBLICO,EstadoDocumento.ACTIVO);
		assertEquals(prueba.hashCode(),CODIGO.hashCode());
	}

	@Test
	public final void testGetters() {
		Documento prueba = new Documento(CODIGO,NOMBRE,FECHA_CREACION,PUBLICO,EstadoDocumento.ACTIVO);
		assertEquals((int) prueba.getCodigo(), 1);
		assertEquals(prueba.getNombre(), "Nombre");
		assertEquals(prueba.getFechaCreacion(), FECHA_CREACION);
		assertEquals(prueba.getPublico(), true);
		assertEquals(prueba.getEstado(), EstadoDocumento.ACTIVO);

	}

	@Test
	public final void testEquals() {

		Documento prueba = new Documento(CODIGO,NOMBRE,FECHA_CREACION,PUBLICO,EstadoDocumento.ACTIVO);
		Documento prueba2 = prueba;
		
		assertEquals(prueba.equals(prueba2), true);
		assertEquals(prueba2.equals("Hola"), false);

	}

	@Test
	public final void testToString() {
		Documento prueba = new Documento(CODIGO,NOMBRE,FECHA_CREACION,PUBLICO,EstadoDocumento.ACTIVO);
		assertEquals(prueba.toString(),"Documento con código = 1");
		
	}

}
