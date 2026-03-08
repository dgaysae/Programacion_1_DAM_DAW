# Unidad 6: Interfaz de Usuario (Swing)
En esta unidad se estudia la creación de **interfaces gráficas de usuario** (GUI) en Java utilizando la librería **Swing**, que es la evolución de la antigua AWT (_Abstract Window Toolkit_).

## 1. AWT vs. Swing
* **AWT**: utiliza componentes pesados (_heavyweight_) que dependen del sistema operativo. Su aspecto cambia según el sistema operativo en el que se ejecute (Windows, Linux, Mac, etc.).

* **Swing**: es parte de las **Java Foundation Classes** (JFC). Sus componentes son ligeros (_lightweight_), están dibujados directamente por Java y ofrecen un aspecto uniforme en cualquier plataforma.

## 2. Modelo-Vista-Controlador (MVC)
Swing se basa en esta arquitectura para separar los datos de la interfaz, de forma que cada parte asuma su **responsabilidad única**:

* **Modelo**: contiene los datos y la lógica necesaria para gestionarlos (altas, bajas, modificaciones y lectura).

* **Vista**: se encarga de la representación visual (las ventanas y sus componentes). No contiene **ninguna lógica**.

* **Controlador**: aglutina la lógica que une el modelo con la vista.

Puedes ver ejemplos de MVC [aquí](./mvc).

## 3. Contenedores principales
Los componentes no pueden flotar en el aire; necesitan estar dentro de contenedores:

* **JFrame**: la **ventana principal** de la aplicación (con botones de cerrar, minimizar, etc.).

* **JDialog**: ventanas **secundarias** o **emergentes** (ej. mensajes de error o avisos).

* **JPanel**: contenedor intermedio invisible que sirve para organizar grupos de componentes dentro de un JFrame.

* **JWindow**: ventana sin bordes ni barra de título (típica de las pantallas de carga o _splash screens_).

## 4. Componentes de uso común

| Componente | Descripción                                             |
|------------|---------------------------------------------------------|
| `JButton`    | Botón clásico para ejecutar acciones.                   |
| `JLabel`     | Texto descriptivo o imágenes no editables.              |
| `JTextField` | Campo de texto de una sola línea para entrada de datos. |
| `JTextArea` | Área de texto de varias líneas.                         |
| `JCheckBox` | Casilla de verificación (opciones múltiples).           |
| `JRadioButton` | Botón de opción (selección única en un grupo).          |
| `JComboBox` | Lista desplegable.                                      |

## 5. Distribución de los componentes (Layout Managers)
Determinan cómo se posicionan los componentes automáticamente:

* **FlowLayout**: los coloca uno al lado del otro (como palabras en un texto).

* **BorderLayout**: divide el contenedor en 5 zonas (`NORTH`, `SOUTH`, `EAST`, `WEST`, `CENTER`).

* **GridLayout**: organiza los componentes en una rejilla de filas y columnas iguales.

* **BoxLayout**: los apila de forma vertical u horizontal.

> Estos Layout Managers se asignan a contenedores como **JFrame** o **JPanel**. De no hacerlo, se asume por defecto el `BorderLayout`.
> 
> ⚠️ Si se asigna un `null`, se tendrán que posicionar manualmente todos los componentes o de lo contrario no se verán en el contenedor.

## 6. Gestión de Eventos ⚡
Para definir el comportamiento de nuestra ventana y los controles que contiene, debemos capturar los
eventos del usuario (clics, teclas, movimientos del ratón, pulsación de un botón, etc.).

Revisa los apuntes para tener claros estos conceptos:

* **Event source**: el componente que genera el evento (ej. un botón).

* **Event listener**: la interfaz que debemos implementar para "escuchar" y responder (ej. ActionListener).

* **Event object**: contiene información sobre lo que pasó (ej. ActionEvent).

> ⚠️ Recuerda que para que un botón o cualquier otro componente funcione, hay que añadir el listener correspondiente.
> Aquí es importante tener claro el uso de las [clases anónimas](./clasesanonimas).
