package xml_feed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	public static void generateMenu() {
		System.out.println("**************************");
		System.out.println("1.- Introducir Producto");
		System.out.println("2.- Introducir Cliente");
		System.out.println("3.- Introducir Pedido");
		System.out.println("0.- Quit");
	}
	
	public static Producto showSubmenuPrd() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String codigo = null;
		String nombre = null;
		String descripcion = null;
		String stock = null;
		String[] localizacion = null;
		String pendientes = null;
		System.out.println("Introduzca el codigo:");
		codigo = in.readLine();
		System.out.println("Introduzca el nombre:");
		nombre = in.readLine();
		System.out.println("Introduzca la descripcion:");
		descripcion = in.readLine();
		System.out.println("Introduzca el stock:");
		stock = in.readLine();
		System.out.println("Introduzca el pasillo:");
		localizacion[0] = in.readLine();
		System.out.println("Introduzca la estanteria:");
		localizacion[1] = in.readLine();
		System.out.println("Introduzca el estante:");
		localizacion[2] = in.readLine();
		System.out.println("Introduzca '1' si esta pendiente:");
		pendientes = in.readLine();
		Producto prod = new Producto(codigo, nombre, descripcion, stock, localizacion, pendientes);
		return prod;
	}
	public static Clientes showSubmenuCln() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = null;
		String apellidos = null;
		String email = null;
		String telefono = null;
		String[] direccion = null;
		System.out.println("Introduzca el nombre:");
		nombre = in.readLine();
		System.out.println("Introduzca los apellidos:");
		apellidos = in.readLine();
		System.out.println("Introduzca el email:");
		email = in.readLine();
		System.out.println("Introduzca el telefono:");
		telefono = in.readLine();
		System.out.println("Introduzca la calle:");
		direccion[0] = in.readLine();
		System.out.println("Introduzca el nuemro:");
		direccion[1] = in.readLine();
		System.out.println("Introduzca el codigo postal:");
		direccion[2] = in.readLine();
		System.out.println("Introduzca la poblacion:");
		direccion[3] = in.readLine();
		System.out.println("Introduzca el pais:");
		direccion[4] = in.readLine();
		Clientes client = new Clientes(nombre, apellidos, email, telefono, direccion);
		return client;
	}
	
	public static Pedidos showSubmenuPd() throws IOException {
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String productos = null;
		String cantidad = null;
		String destinatario = null;
		String fecha = null;
		String[] direccion = null;
		System.out.println("Introduzca el producto:");
		productos = in.readLine();
		System.out.println("Introduzca la cantidad:");
		cantidad = in.readLine();
		System.out.println("Introduzca el destinatario:");
		destinatario = in.readLine();
		System.out.println("Introduzca la fecha de entrega:");
		fecha = in.readLine();
		System.out.println("Introduzca la calle:");
		direccion[0] = in.readLine();
		System.out.println("Introduzca el nuemro:");
		direccion[1] = in.readLine();
		System.out.println("Introduzca el codigo postal:");
		direccion[2] = in.readLine();
		System.out.println("Introduzca la poblacion:");
		direccion[3] = in.readLine();
		System.out.println("Introduzca el pais:");
		direccion[4] = in.readLine();
		Pedidos pedid = new Pedidos(productos, cantidad, destinatario, fecha, direccion);
		return pedid;
	}
	
	public static void writeToFile(String xml, String fileName) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	

	public static void main(String[] args) throws IOException {
			
			ArrayList<Producto> productos = new ArrayList<Producto>();
			ArrayList<Clientes> cliente = new ArrayList<Clientes>();
			ArrayList<Pedidos> pedido = new ArrayList<Pedidos>();
			int menu = -1;
			
			java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			while (menu != 0) {
				generateMenu();
				menu = Integer.parseInt(in.readLine());
				
				switch (menu) {
				case 1:
					Producto producto_leido = showSubmenuPrd();
					productos.add(producto_leido);
					break;
				case 2:
					Clientes cliente_leido = showSubmenuCln();
					cliente.add(cliente_leido);
				case 3:
					Pedidos pedido_leido = showSubmenuPd();
					pedido.add(pedido_leido);
				case 0:
					break;
				}
			}
			String header = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n";
			String root = "<clase>\n";
			String xml = "";
			xml += header + root;
			for (Producto a: productos) {
				xml += a;
				System.out.println(xml);
			}
			String close_root = "\n</clase>";

			xml += close_root;
			writeToFile(xml, "xmlFile.xml");

	}

}
