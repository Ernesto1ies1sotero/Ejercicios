package u2e44;

public class Carrito {

    public Articulo[] carrito;
    public int numArticulos;
    public boolean inicializado;

    public void inicializaCarrito(int numPosiciones) {
        carrito = new Articulo[numPosiciones];
        numArticulos = 0;
        inicializado = true;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void guardaArticulo(Articulo nuevoArtic) {
        if (!inicializado) {
            System.out.println("Error: carrito aún no inicializado");
        } else {
            if (numArticulos >= carrito.length) {
                System.out.println("Error: carrito lleno");
            } else {
                if (nuevoArtic == Articulo.NOT_FOUND) {
                    System.out.println("No se puede guardar artículo nulo");
                } else {
                    carrito[numArticulos] = nuevoArtic;
                    numArticulos++;
                }
            }

        }
    }

    public void muestraArticulos() {
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            if (numArticulos == 0) {
                System.out.println("No hay artículos en el carro");
            } else {
                for (int i = 0; i < numArticulos; i++) {
                    Articulo elem = carrito[i];
                    System.out.println("Id=" + elem.getIdArticulo() + ", nombre="
                            + elem.getNombre() + ", precio=" + elem.getPrecio() + "€");
                }
            }
        }

    }

    public double getPrecioTotalCarrito() {
        double result = 0;
        double total = 0;

        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            if (numArticulos != 0) {
                for (int i = 0; i < numArticulos; i++) {
                    Articulo elem = carrito[i];
                    total = total + elem.getPrecio();
                }
                result = total;
            }
        }
        return result;
    }

//+ buscaArticuloPorId (idABuscar: entero) devuelve Articulo
    public void muestraArticulos(int numInicial, int numFinal) {
    }

    public Articulo buscaArticuloPorId(int idABuscar) {
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
            return Articulo.NOT_FOUND;
        } else {
            if (numArticulos == 0) {
                return Articulo.NOT_FOUND;
            } else {
                for (int i = 0; i < numArticulos; i++) {
                    Articulo elem = carrito[i];
                    if (elem.getIdArticulo() == idABuscar) {
                        return elem;
                    }
                }
                return Articulo.NOT_FOUND;
            }
        }
    }

}
