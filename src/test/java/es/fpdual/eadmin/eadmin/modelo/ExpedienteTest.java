package es.fpdual.eadmin.eadmin.modelo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ExpedienteTest {
	private static final Integer CODIGO = 1;
	private static final String NOMBRE = "Nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Date FECHA_ARCHIVADO = new Date();
	private static final Boolean PUBLICO = true;
	private static final EstadoExpediente ESTADO = EstadoExpediente.ARCHIVADO;
	private static final List<Documento> lISTA_DOCUMENTO = new ArrayList<>();
	Expediente prueba; Expediente prueba2;
	
	@Before
	public void crearInstancias() {
		prueba = new Expediente(CODIGO,NOMBRE,FECHA_CREACION,FECHA_ARCHIVADO,PUBLICO,ESTADO,lISTA_DOCUMENTO);
		prueba2 = new Expediente(CODIGO,NOMBRE,FECHA_CREACION,FECHA_ARCHIVADO,PUBLICO,ESTADO,lISTA_DOCUMENTO);
	}

	@Test
	public final void testHashCode() {
		
		assertEquals(prueba.hashCode(),CODIGO.hashCode() + NOMBRE.hashCode() + FECHA_CREACION.hashCode() 
		+ FECHA_ARCHIVADO.hashCode() + PUBLICO.hashCode() + ESTADO.hashCode());
		
	}

	@Test
	public final void testGetters() {
		
		assertEquals(prueba.getCodigo(),CODIGO);
		assertEquals(prueba.getNombre(),NOMBRE);
		assertEquals(prueba.getFechaCreacion(),FECHA_CREACION);
		assertEquals(prueba.getFechaArchivado(),FECHA_ARCHIVADO);
		assertEquals(prueba.getPublico(),PUBLICO);
		assertEquals(prueba.getEstado(),ESTADO);
		assertEquals(prueba.getListaDocumento(), null);
		
	}

	@Test
	public final void testEqualsObject() {
		
		assertEquals(prueba.equals(prueba2),true);
		assertEquals(prueba.equals("Hola!"), false);
		
	}

	@Test
	public final void testToString() {
		
		assertEquals(prueba.toString(),"Expediente código = " + CODIGO + ", nombre = " + NOMBRE + ", fechaCreacion = " + FECHA_CREACION
				+ ", fechaArchivado = " + FECHA_ARCHIVADO + ", publico = " + PUBLICO + ", estado = " + ESTADO);
		
	}

}
