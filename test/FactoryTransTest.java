
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTransTest {
    @Test
    @DisplayName("DevolverBicicleta")
    public void testGetTransporteReturnBicicletaNotNull() {
        IComun producto = FactoriaSalidas.getProducto(FactoriaSalidas.BICICLETA);
        assertTrue(producto instanceof Bicicleta);
    }
    @Test
    @DisplayName("DevolverCamion")
    public void testGetTransporteReturnCamionNotNull() {
        IComun producto = FactoriaSalidas.getProducto(FactoriaSalidas.CAMION);
        assertTrue(producto instanceof Camion);

    }

}
