package co.com.prueba.banitsmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DescargaUser {

    public static final Target BTN_ACERCA_NOSOTROS = Target.the("Boton acerca de nosotros").locatedBy("//a[@id ='header-nosotros']");
    public static final Target INFORMACION_CORPORATIVA = Target.the("Boton informacion corporativa").locatedBy("//div[@id ='main-menu']/descendant-or-self::a[text()='Información Corporativa']");
    public static final Target BTN_PROVEEDORES = Target.the("Proveedores").locatedBy("//div[@id ='informacionCorporativaAcercaDe']/descendant-or-self::a[text()='Proveedores']");
    public static final Target BTN_DESCARGAR_DOCUMENTO = Target.the("Boton descargar documento").locatedBy("//div[@class = 'container-paso-paso entradilla-grande-wizard' and contains(.,'Políticas de tratamiento y de protección de datos personales de proveedores')]/descendant-or-self::a[text()='Descarga el documento']");
    public static final Target PAG_REPORTE = Target.the("Reporte de pdf").locatedBy("//embed[@type = 'application/pdf']");

}
