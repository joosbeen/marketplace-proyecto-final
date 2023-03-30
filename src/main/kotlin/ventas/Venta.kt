package ventas

import producto.Producto
import usuario.Usuario
import java.util.Date

data class Venta(val id: Int, val fecha: String, val productos: MutableList<Producto>, val usuario: Usuario) {}