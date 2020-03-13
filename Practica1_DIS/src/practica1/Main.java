package practica1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;//
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;//

public class Main {

	public static void main(String[] args) throws IOException {
		int opcion = 1;
		boolean haypedido = false;
		ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
		int num_productos = 0;
		java.io.BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		Calendar fecha_estimada = Calendar.getInstance();
		while(opcion != 0) {																									//Bucle principal del programa que contiene el menu
			System.out.println("1:Realizar un nuevo Pedido");
			System.out.println("2:Recuperar pedido almacenado");
			System.out.println("3:Guardar pedidos en la base de datos");
			System.out.println("0:Salir");
			try{
			opcion = Integer.parseUnsignedInt(in.readLine());
			}
			catch(Exception e){
				System.out.println("Error: introduzca un valor numerico\n");
				opcion = -1;
			}
			if(opcion == 1) {																									//Primera opcion de generar nuevo pedido
				haypedido = true;
				System.out.println("Creando un nuevo pedido");
				Pedidos pedido_aux = new Pedidos();
				System.out.println("¿Cuantos productos distintos contiene el pedido?");
				try{
					num_productos = Integer.parseUnsignedInt(in.readLine());
				}
				catch(Exception e){
					System.out.println("Error: introduzca un valor numerico");
					num_productos = Integer.parseUnsignedInt(in.readLine());
				}
				for(int i = 0; i < num_productos; i++) {																		//Bucle para solicitar toda la informacion de cada producto del pedido
					pedido_aux.productos.add(new Producto());
					System.out.println("Codigo del producto");
					pedido_aux.productos.get(i).setCodigo(in.readLine());
					System.out.println("Nombre del producto");
					pedido_aux.productos.get(i).setNombre(in.readLine());
					System.out.println("Descripcion del producto");
					pedido_aux.productos.get(i).setDescripcion(in.readLine());
					System.out.println("¿Esta disponible?\n0:NO\t1:SI");
					try{
					pedido_aux.productos.get(i).setStock(Integer.parseUnsignedInt(in.readLine()));
					}
					catch(Exception e){
						System.out.println("Error: introduzca 0:NO\\t1:SI");
						pedido_aux.productos.get(i).setStock(Integer.parseUnsignedInt(in.readLine()));
					}
					if(pedido_aux.productos.get(i).getStock() == 1) {															//Si esta en Stock solicita la informacion de su ubicacion
						pedido_aux.productos.get(i).setLocalizacion(new Localizacion());
						System.out.println("Numero de pasillo");
						try{
							pedido_aux.productos.get(i).getLocalizacion().setPasillo(Integer.parseUnsignedInt(in.readLine()));
						}
						catch(Exception e){
							System.out.println("Error: introduzca un valor numerico");
							pedido_aux.productos.get(i).getLocalizacion().setPasillo(Integer.parseUnsignedInt(in.readLine()));
						}
						System.out.println("Numero de estanteria");
						try{
							pedido_aux.productos.get(i).getLocalizacion().setEstanteria(Integer.parseUnsignedInt(in.readLine()));
						}
						catch(Exception e){
							System.out.println("Error: introduzca un valor numerico");
							pedido_aux.productos.get(i).getLocalizacion().setEstanteria(Integer.parseUnsignedInt(in.readLine()));
						}
						System.out.println("Numero de estante");
						try{
							pedido_aux.productos.get(i).getLocalizacion().setEstante(Integer.parseUnsignedInt(in.readLine()));
						}
						catch(Exception e){
							System.out.println("Error: introduzca un valor numerico");
							pedido_aux.productos.get(i).getLocalizacion().setEstante(Integer.parseUnsignedInt(in.readLine()));
						}
					}
					System.out.println("¿Esta pendiente el producto?\n0:NO\t1:SI");
					try{
						pedido_aux.productos.get(i).setPendiente(Integer.parseUnsignedInt(in.readLine()));
					}
					catch(Exception e){
						System.out.println("Error: introduzca 0:NO\\t1:SI");
						pedido_aux.productos.get(i).setPendiente(Integer.parseUnsignedInt(in.readLine()));
					}
					System.out.println("¿Numero de unidades deseadas?");
					try{
						pedido_aux.cantidad.add(Integer.parseUnsignedInt(in.readLine()));
					}
					catch(Exception e){
						System.out.println("Error: introduzca un valor numerico");
						pedido_aux.cantidad.add(Integer.parseUnsignedInt(in.readLine()));
					}
				}
				System.out.println("Datos del cliente");																		//Comienzo de la solicitud de la informacion del cliente que realiza el pedido
				System.out.println("Nombre");
				pedido_aux.setCliente(new Clientes());		
				pedido_aux.getCliente().setNombre(in.readLine());
				System.out.println("Apellidos");
				pedido_aux.getCliente().setApellido(in.readLine());
				System.out.println("Email");
				pedido_aux.getCliente().setEmail(in.readLine());
				System.out.println("Telefono de contacto");
				pedido_aux.getCliente().setNumero_telefono(in.readLine());
				System.out.println("Direccion");
				pedido_aux.getCliente().setDireccion(new Direccion());
				System.out.println("Nombre de la calle");
				pedido_aux.getCliente().getDireccion().setCalle(in.readLine());
				System.out.println("Numero de la casa");
				try{
					pedido_aux.getCliente().getDireccion().setNumero(Integer.parseUnsignedInt(in.readLine()));
				}
				catch(Exception e){
					System.out.println("Error: introduzca un valor numerico");
					pedido_aux.getCliente().getDireccion().setNumero(Integer.parseUnsignedInt(in.readLine()));
				}
				System.out.println("Codigo postal");
				try{
					pedido_aux.getCliente().getDireccion().setCodigo_postal(Integer.parseUnsignedInt(in.readLine()));
				}
				catch(Exception e){
					System.out.println("Error: introduzca un valor numerico");
					pedido_aux.getCliente().getDireccion().setCodigo_postal(Integer.parseUnsignedInt(in.readLine()));
				}
				System.out.println("Poblacion");
				pedido_aux.getCliente().getDireccion().setPoblacion(in.readLine());
				System.out.println("Pais");
				pedido_aux.getCliente().getDireccion().setPais(in.readLine());
				System.out.println("¿Se entregara en esta direccion?\n0:NO\t1:SI");
				int respuesta = Integer.parseUnsignedInt(in.readLine());
				if(respuesta == 0) {																							//Si se entrega en una direccion distinta a la del cliente se solicitara esa informacion
					pedido_aux.setDireccion_entrega(new Direccion());
					System.out.println("Datos de entrega");
					System.out.println("Nombre de la calle");
					pedido_aux.getDireccion_entrega().setCalle(in.readLine());
					System.out.println("Numero de la casa");
					try{
						pedido_aux.getDireccion_entrega().setNumero(Integer.parseUnsignedInt(in.readLine()));
					}
					catch(Exception e){
						System.out.println("Error: introduzca un valor numerico");
						pedido_aux.getDireccion_entrega().setNumero(Integer.parseUnsignedInt(in.readLine()));
					}
					System.out.println("Codigo postal");
					try{
						pedido_aux.getDireccion_entrega().setCodigo_postal(Integer.parseUnsignedInt(in.readLine()));
					}
					catch(Exception e){
						System.out.println("Error: introduzca un valor numerico");
						pedido_aux.getDireccion_entrega().setCodigo_postal(Integer.parseUnsignedInt(in.readLine()));
					}
					System.out.println("Poblacion");
					pedido_aux.getDireccion_entrega().setPoblacion(in.readLine());
					System.out.println("Pais");
					pedido_aux.getDireccion_entrega().setPais(in.readLine());
				}
				else if(respuesta == 1) {																						//Si es la misma, se guardara la informacion directamente
					pedido_aux.setDireccion_entrega(pedido_aux.getCliente().getDireccion());
				}
				System.out.println("Destinatario del pedido");
				pedido_aux.setDestinatario(in.readLine());
				pedido_aux.setFecha_entrega(fecha_estimada.getTime());
				System.out.println("Pedido generado correctamente\n");															//Mensaje de perdido guardado y actoseguido se guarda el pedido
				pedidos.add(pedido_aux);
			}
			
			
			else if(opcion == 2) {																								//Segunda opcion de recuperar pedido
				File xmlfile = new File("pedidos.xml");
				JAXBContext jaxbContext;
				try
				{
					jaxbContext = JAXBContext.newInstance(Pedidos.class);
					Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
					Pedidos pedidosxml = (Pedidos)jaxbUnmarshaller.unmarshal(xmlfile);
					System.out.println("Informacion del pedido almacenado");
					System.out.println(pedidosxml);
					System.out.println(" ");
				}
				catch (JAXBException e) 
		        {
		            e.printStackTrace();
		        }
			}
			
			
			else if(opcion == 3) {																								//Tercera opcion de guardar pedido, se guardadara en pedidos.xml
				if(haypedido) {																									//Comprueba si hay pedido para guardar
					JAXBContext contextObj;
					try {
						contextObj = JAXBContext.newInstance(Pedidos.class);
				    	Marshaller marshallerObj = contextObj.createMarshaller();  
				    	marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
				    	marshallerObj.marshal(pedidos.get(0), new FileOutputStream("pedidos.xml"));  
					
					} catch (JAXBException e) {
						e.printStackTrace();
					}
					System.out.println("Pedido guardado correctamente\n");
				}
				else {																											//Si no hay pedido muestra mensaje y vuelve al menu de inicio
					System.out.println("Primero debe generar un pedido para guardar\n");
				}
			}
			
			else if(opcion == 0) {																								//Opcion de salir del programa
				System.out.println("Vuelva pronto y que tenga un buen dia");
			}
		}
		
	}
}
