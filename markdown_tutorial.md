# Markdown - Sintáxis básicas

## Encabezados

Es importante dejar un espacio entre la almohadilla (#) y el texto del encabezado. Si no, ocurre esto:

#Esto no es un encabezado 1.

##Esto no es un encabezado 2.

######Esto no es un encabezado 6.

Además, deben dejarse líneas en blanco que separen un encabezado de otro texto.



# Este encabezado equivale al h1 de HTML

Este encabezado también equivale al h1 de HTML
==============================================

## Este encabezado equivale al h2 de HTML

Este encabezado también equivale al h2 de HTML
----------------------------------------------

### Este encabezado equivale al h3 de HTML

#### Este encabezado equivale al h4 de HTML

##### Este encabezado equivale al h5 de HTML

###### Este encabezado equivale al h6 de HTML

## Párrafos

Para crear párrafos, simplemente separamos los unos de los otros con una línea en blanco. Por ejemplo:

Esta frase pertenece a un párrafo.
Y esta otra sigue en el mismo párrafo.

Pero esta otra frase está ya en otro párrafo.

**IMPORTANTE**: no se debe indentar el texto de los párrafos.

    Este texto indentado no no es recomendable, ya que el resultado puede ser distinto a lo que queremos.

## Saltos de línea

Si queremos que un texto de un salto de línea sin irse a otro párrafo, usaremos el elemento HTML `<br>`:

Esta frase pertenece a un párrafo.<br>
Y esta otra sigue en el mismo párrafo, **pero en la siguiente línea**.

También podemos conseguir el mismo efecto poniendo dos espacios en blanco al final de la línea:

Esta frase pertenece a un párrafo.  
Y esta otra sigue en el mismo párrafo, **pero en la siguiente línea**.


## Negrita y cursiva - Texto con énfasis

El efecto de cursiva en HTML se hace con el elemento `<em></em>`:

<em>Una forma de poner un texto en cursiva</em>

En markdown se consigue con `*` o con `_`:

*Cursiva usando asteríscos*  
_Cursiva usando guiones bajos_

**Una forma de poner un texto en negrita**  
__También puede hacerse de esta otra__

_Se pueden anidar unos formatos **dentro de otros**, como en este ejemplo_

**O en _este otro_ también**

Pero hay que tener cuidado con los **espacios **.

Por otro lado, podemos poner un texto en negrita y cursiva al mismo tiempo combinando `*` y `_` para rodear el texto afectado con un total de 3 modificadores por lado:

***esto es una muestra***

___esto es una muestra___

*__esto es una muestra__*

**_esto es una muestra_**

_**esto es una muestra**_

### Tachado

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

Para tachar un texto basta con rodearlo con virgulilla doble `~~`:

~~Las vacunas provocan autismo.~~ Las vacunas salvan vidas. 

### Resaltar

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

El resaltado de un texto es una función poco común y poco procesadores Markdown permiten su uso. El resultado se ve <mark>así</mark>.

Para ello rodeamos la palabra o frase con dos signos igual (==) a cada lado.

Lo más importante es ==su ubicación==.

El resultado se vería así:

Lo más importante es <mark>su ubicación</mark>.

ℹ️ Si se necesita este formato y este doble igual no funciona, se puede usar el elemento `mark` de HTML.

## Línea horizontal

Puedes mostrar una línea horizontal poniendo tres `-` seguidos.

---

También pueden ser `*`:

***

O con `_`:

___

## Listas

### Viñetas

Podemos usar `*`, `+` o `-` para crear listas no ordenadas:

* Elemento 1
* Elemento 2
  * Elemento 2a
  * Elemento 2b

+ Elemento 1
  + Elemento 1a
  + Elemento 1b
    + Elemento 1b1
    + Elemento 1b2

También podemos hacerlas usando guiones o mezclando guiones y asteríscos:
- Elemento 1
- Elemento 2
  * Elemento 2a
  * Elemento 2b
    
    Y podemos extender la explicación de cualquier elemento de la lista simplemente indentando.

- Elemento 3
  * Elemento 3a
  * Elemento 3b
    > También podemos indentar un bloque de cita para inscrustarlo en alguno de los elementos de la lista.
    + Elemento 3b1
    + Elemento 3b2

Si algún ítem empieza por un número:

- 10. Nota máxima.
- Le sigue el 9 y 8.

Para mostrarlo sin problemas, hay que escapar el número usando `\`:
- 10\. Nota máxima.
- Le sigue el 9 y 8.


### Viñetas numeradas

Aunque se puede usar un número distinto para cada uno, lo mejor es utilizar siempre el 1. para que, en caso de tener que cambiar algún elemento de sitio en la lista, no sea necesario retocar todos los números:

1. Elemento 1
1. Elemento 2
   1. Elemento 2a
   1. Elemento 2b
1. Elemento 3
   1. Elemento 3a
   1. Elemento 3b
      1. Elemento 3b1
      1. Elemento 3b2

### Lista de checkboxes

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

Se puede representar una lista de tareas usando *checkboxes* que representamos con corchetes `[ ]` para checks sin pulsar y `[x]` para los marcados: 

- [x] Hacer apuntes de markdown.
- [ ] Estudiar para el examen de entornos de desarrollo.
- [ ] Comprar lechuga y tomates.


## Imágenes

Como en HTML, podemos especificar:
1. Texto alternativo (atributo `alt` de HTML).
1. Ruta de la imagen, tanto local como remota (atributo `src` de HTML).
1. Texto emergente, que se muestra al posar el cursor sobre la imagen (atributo `title` de HTML).

![Texto alternativo de la imagen](https://iescelia.org/web/wp-content/uploads/2012/05/fachada_rambla.jpg "Texto emergente que se muestra al situar el cursor del ratón sobre la imagen")

### Ajustar tamaño de la imagen

Markdown no permite redimensionar imágenes, por lo que hay que hacerlo directamente con HTML:

<img
src="https://iescelia.org/web/wp-content/uploads/2012/05/fachada_rambla.jpg"
alt="IES Celia Viñas"
width="40%"
title="IES Celia Viñas">

### Imágenes como enlaces

Si queremos que nuestra imagen ejerza como enlace, sólo tenemos que ponerla en el corchete inicial:

`[imagen](URL del enlace)`

Para el caso anterior:

[![Texto alternativo de la imagen](https://iescelia.org/web/wp-content/uploads/2012/05/fachada_rambla.jpg)](https://iescelia.org/)

## Emojies

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

Podemos incluir emojies en nuestros documentos markdown copiándolos de la lista de emojies de nuestro sistema operativo y pegándolos directamente en el código markdown. También podemos copiarlos de la [Emojipedia](https://emojipedia.org/).

Pero también podemos escribir códigos rodeados de `:` como se puede ver en el [anexo I](#anexo-i) de este documento.

## Enlaces

Como ocurre con las imágenes, el enlace se hace de forma casi idéntica (excepto por la exclamación del principio).

Entra en la web del [IES Celia Viñas](https://iescelia.org "¡Entra e infórmate!").

Si queremos que el enlace se abra en otra ventana o pestaña:

[IES Celia Viñas](https://iescelia.org "¡Entra e infórmate!"){:target="_blank"}

En general, la mayoría de los procesadores de Markdown, cuando detectan una URL o dirección de correo entre el texto a mostrar, automáticamente la convierten en un enlace:

https://iescelia.org  
pepe@micorreo.es

Si no es así, podemos forzarlo introduciéndolas entre `<` y `>`:

<https://iescelia.org>  
<pepe@micorreo.es>

Pero si queremos el efecto contrario, es decir, que no sean un enlace, podemos poner esa dirección como código (entre comillas simples invertidas):

`https://iescelia.org`  
`pepe@micorreo.es`

Los enlaces se pueden formatear en negrita y cursiva e incluso mostrarlos en formato código:

La web de **[EFF](https://eff.org)** mola mucho.  
Te recomiendo la guía de markdown *[Markdown Guide](https://www.markdownguide.org)*.  
Te recomiendo la guía de [`markdown`](https://www.markdownguide.org).

### Enlaces a una misma página

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

Podemos crear enlaces que vayan a una parte de la misma página de la siguiente forma:

[encabezados](#encabezados)

Previamente hemos tenido que incluir una etiqueta con el mismo nombre en el título correspondiente.


### Enlaces parametrizados o de referencia

Si vamos a usar una URL como enlace en varias partes del documento Markdown, lo mejor es escribirla una sola vez y aplicarla allá donde queramos.

Para ello la segunda parte del enlace (la URL) la almacenaremos en una etiqueta **al final del documento** de esta forma:

```
[1]: https://www.eff.org/ "It's cool!!"
```

**Nota**: podemos comprobar que no se ve nada en la visualización del documento.

Luego creamos un enlace usando dicha etiqueta:

```
Esta web del **[EFF][1]** es muy interesante.
```

El resultado es el siguiente:

> Esta web del **[EFF][1]** es muy interesante.

**IMPORTANTE**: también podemos darle un nombre a dicha etiqueta:


```
[linkRG]: https://refactoring.guru/ "It's really cool!!"
```

Te recomiendo la web de **[Refactoring Guru][linkRG]** para aprender sobre patrones de diseño.

### Notas a pie de página

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

Un ejemplo puede ser este[^1] y, como hemos visto antes, podemos poner nuestra propia etiqueta de esta forma[^notaPie1].

## Citas

Para poner un párrafo como bloque de una cita ponemos `> ` delante de un párrafo:

> Este texto es una cita. Por ejemplo, el **markdown** es un lenguaje de marcas muy simple y ligero que usa texto plano.

Si queremos que el bloque ocupe varios párrafos:

> Este texto es una cita. Por ejemplo, el **markdown** es un lenguaje de marcas muy simple y ligero que usa texto plano.
> 
> Y se puede extender tantas líneas como queramos.

Además, se pueden anidar bloques de citas:

> Este texto es una cita. Por ejemplo, el **markdown** es un lenguaje de marcas muy simple y ligero que usa texto plano.
>> Y dentro de la anterior se puede anidar otra cita.
>>> Y otra...

Además, se puede hacer un bloque de cita usando otros elementos de markdown. **Importante**! No todos funcionan!


> ## Encabezado de la cita
>
> - Viñeta de elementos.
> - Que no están ordenados.
> 
> 1. O que si lo están.
> 1. y *funciona* **correctamente**.
>
>  ---
> asdf

## Tablas

Una tabla básica delimitando cada celda con un *pipe* `|` y usando guiones para separar los títulos de las columnas del resto de datos:

| Nombre | Edad |
| --- | --- |
| Anselmo Pérez | 33 |
| Federico Lorenzo | 45 |

Podemos crear tablas indicando algunas opciones de forma simple:

| Columna 1  | Columna 2 | Columna 3 |
| --- |:---:| ---:|
| alineado *izq* 1 | centrado 1 | alineado dcha 1 |
| alineado izq 2 | **centrado** 2 | alineado dcha 2 |
| `alineado` izq 3 | centrado 3 | alineado dcha 3 |

**IMPORTANTE**: el texto de las celdas de la tabla se puede formatear, añadiendo enlaces, código en palabras o frases entre comillas (no bloques de código) y negrita y cursiva. No se pueden usar encabezados, citas en bloque, listas, reglas horizontales, imágenes ni muchas de las etiquetas HTML.

## Código y bloques de código

Para escribir una palabra o frase en formato de código, lo pondremos entre comillas invertidas: `como en este caso`

Podemos introducir un bloque de código genérico indentando hasta 4 espacios desde el margen izquierdo:

    <html>
        <head>
            <title>Título de la página</title>
        </head>
        </body>
            <p>
                Bla bla bla...
            </p>
        </body>
    </html>

Se puede añadir a una lista:

1. Primer punto de la lista.
1. Segundo punto, que incluye el siguiente código (hay que dejar una línea en blanco):

       <html>
           <head>
               <title>Título de la página</title>
           </head>
           </body>
           <p>
              Bla bla bla...
           </p>
           </body>
       </html>

1. Tercer punto de la lista.

También se puede delimitar entre triples comillas simples invertidas \`
```
<html>
    <head>
        <title>Título de la página</title>
    </head>
    <body>
        <p>Esto es un párrafo</p>
    </body>
</html>
```

Si queremos que el código se muestre coloreado, como se ve en los IDEs y editores de código, se puede incluir el nombre del lenguaje:

```html
<html>
    <head>
        <title>Título de la página</title>
    </head>
    <body>
        <p>Esto es un párrafo</p>
    </body>
</html>
```

```javascript
let texto = 'Hola, mundo!';
var edad = 33;
```

```java
import unidad07.genericos.ejemplo02.singenericos.Persona;

Persona persona = new Persona("Anselmo", 33, "12345678A");
System.out.

printf(
    "%s tiene %d años y su DNI es %s",
    persona.getNombre(),
    persona.

getEdad(),
    persona.

getDni()
);
```

## Listas de definiciones

ℹ️ Esta funcionalidad forma parte de la **sintaxis extendida** de markdown. 

En HTML:

<dl>
  <dt>perro, rra</dt>
  <dd>
    m. y f. Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueño. U. en m. ref. a la especie.
  </dd>
  <dd>
    m. y f. coloq. Persona despreciable. U. t. c. insulto.
  </dd>
  <dd>
    m. Mal o daño que se ocasiona a alguien al engañarle en un acuerdo o pacto.
  </dd>
  <dt>gato, ta</dt>
  <dd>
    m. y f. Mamífero de la familia de los félidos, digitígrado, doméstico, de unos 50 cm de largo desde la cabeza hasta el arranque de la cola, que por sí sola mide unos 20 cm, de cabeza redonda, lengua muy áspera, patas cortas y generalmente pelaje suave y espeso, de color blanco, gris, pardo, rojizo o negro, empleado en algunos lugares para cazar ratones. U. en m. ref. a la especie.
  </dd>
  <dd>
    m. y f. coloq. Persona nacida en Madrid.
  </dd>
  <dd>
    m. y f. C. Rica y Nic. Persona que tiene los ojos verdes o azules. U. t. c. adj.
  </dd>
</dl>


En markdown:

perro, rra
: m. y f. Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueño. U. en m. ref. a la especie.
: m. y f. coloq. Persona despreciable. U. t. c. insulto.
: m. Mal o daño que se ocasiona a alguien al engañarle en un acuerdo o pacto.

gato, ta
: m. y f. Mamífero de la familia de los félidos, digitígrado, doméstico, de unos 50 cm de largo desde la cabeza hasta el arranque de la cola, que por sí sola mide unos 20 cm, de cabeza redonda, lengua muy áspera, patas cortas y generalmente pelaje suave y espeso, de color blanco, gris, pardo, rojizo o negro, empleado en algunos lugares para cazar ratones. U. en m. ref. a la especie.
: m. y f. coloq. Persona nacida en Madrid.
: m. y f. C. Rica y Nic. Persona que tiene los ojos verdes o azules. U. t. c. adj.

## Caracteres de escape

Ya hemos visto caracteres que sirven como *comando* para indicar al documento que determinado texto debe tener un formato comportarse de determinada manera.

Si queremos mostrar alguno de esos caracteres, tenemos que hacer que escapen de esa función. Para ello usamos la barra invertida (\) delante de dicho carácter. Veamos algunos ejemplos:


Con la barra podemos mostrar la comilla simple: \`

O los asteríscos: \*esto no está formateado\*

En [esta tabla](https://www.markdownguide.org/basic-syntax/#characters-you-can-escape) puedes ver los caracteres que puedes escapar.

# Anexo I

## Lista de emojies.

Este listado se ha copiado de este [gist](https://gist.github.com/rxaviers/7360908) de [Rafael Xavier de Souza](https://gist.github.com/rxaviers)

People

| :bowtie: `:bowtie:` | :smile: `:smile:` | :laughing: `:laughing:` |
|---|---|---|
| :blush: `:blush:` | :smiley: `:smiley:` | :relaxed: `:relaxed:` |
| :smirk: `:smirk:` | :heart_eyes: `:heart_eyes:` | :kissing_heart: `:kissing_heart:` |
| :kissing_closed_eyes: `:kissing_closed_eyes:` | :flushed: `:flushed:` | :relieved: `:relieved:` |
| :satisfied: `:satisfied:` | :grin: `:grin:` | :wink: `:wink:` |
| :stuck_out_tongue_winking_eye: `:stuck_out_tongue_winking_eye:` | :stuck_out_tongue_closed_eyes: `:stuck_out_tongue_closed_eyes:` | :grinning: `:grinning:` |
| :kissing: `:kissing:` | :kissing_smiling_eyes: `:kissing_smiling_eyes:` | :stuck_out_tongue: `:stuck_out_tongue:` |
| :sleeping: `:sleeping:` | :worried: `:worried:` | :frowning: `:frowning:` |
| :anguished: `:anguished:` | :open_mouth: `:open_mouth:` | :grimacing: `:grimacing:` |
| :confused: `:confused:` | :hushed: `:hushed:` | :expressionless: `:expressionless:` |
| :unamused: `:unamused:` | :sweat_smile: `:sweat_smile:` | :sweat: `:sweat:` |
| :disappointed_relieved: `:disappointed_relieved:` | :weary: `:weary:` | :pensive: `:pensive:` |
| :disappointed: `:disappointed:` | :confounded: `:confounded:` | :fearful: `:fearful:` |
| :cold_sweat: `:cold_sweat:` | :persevere: `:persevere:` | :cry: `:cry:` |
| :sob: `:sob:` | :joy: `:joy:` | :astonished: `:astonished:` |
| :scream: `:scream:` | :neckbeard: `:neckbeard:` | :tired_face: `:tired_face:` |
| :angry: `:angry:` | :rage: `:rage:` | :triumph: `:triumph:` |
| :sleepy: `:sleepy:` | :yum: `:yum:` | :mask: `:mask:` |
| :sunglasses: `:sunglasses:` | :dizzy_face: `:dizzy_face:` | :imp: `:imp:` |
| :smiling_imp: `:smiling_imp:` | :neutral_face: `:neutral_face:` | :no_mouth: `:no_mouth:` |
| :innocent: `:innocent:` | :alien: `:alien:` | :yellow_heart: `:yellow_heart:` |
| :blue_heart: `:blue_heart:` | :purple_heart: `:purple_heart:` | :heart: `:heart:` |
| :green_heart: `:green_heart:` | :broken_heart: `:broken_heart:` | :heartbeat: `:heartbeat:` |
| :heartpulse: `:heartpulse:` | :two_hearts: `:two_hearts:` | :revolving_hearts: `:revolving_hearts:` |
| :cupid: `:cupid:` | :sparkling_heart: `:sparkling_heart:` | :sparkles: `:sparkles:` |
| :star: `:star:` | :star2: `:star2:` | :dizzy: `:dizzy:` |
| :boom: `:boom:` | :collision: `:collision:` | :anger: `:anger:` |
| :exclamation: `:exclamation:` | :question: `:question:` | :grey_exclamation: `:grey_exclamation:` |
| :grey_question: `:grey_question:` | :zzz: `:zzz:` | :dash: `:dash:` |
| :sweat_drops: `:sweat_drops:` | :notes: `:notes:` | :musical_note: `:musical_note:` |
| :fire: `:fire:` | :hankey: `:hankey:` | :poop: `:poop:` |
| :shit: `:shit:` | :+1: `:+1:` | :thumbsup: `:thumbsup:` |
| :-1: `:-1:` | :thumbsdown: `:thumbsdown:` | :ok_hand: `:ok_hand:` |
| :punch: `:punch:` | :facepunch: `:facepunch:` | :fist: `:fist:` |
| :v: `:v:` | :wave: `:wave:` | :hand: `:hand:` |
| :raised_hand: `:raised_hand:` | :open_hands: `:open_hands:` | :point_up: `:point_up:` |
| :point_down: `:point_down:` | :point_left: `:point_left:` | :point_right: `:point_right:` |
| :raised_hands: `:raised_hands:` | :pray: `:pray:` | :point_up_2: `:point_up_2:` |
| :clap: `:clap:` | :muscle: `:muscle:` | :metal: `:metal:` |
| :fu: `:fu:` | :walking: `:walking:` | :runner: `:runner:` |
| :running: `:running:` | :couple: `:couple:` | :family: `:family:` |
| :two_men_holding_hands: `:two_men_holding_hands:` | :two_women_holding_hands: `:two_women_holding_hands:` | :dancer: `:dancer:` |
| :dancers: `:dancers:` | :ok_woman: `:ok_woman:` | :no_good: `:no_good:` |
| :information_desk_person: `:information_desk_person:` | :raising_hand: `:raising_hand:` | :bride_with_veil: `:bride_with_veil:` |
| :person_with_pouting_face: `:person_with_pouting_face:` | :person_frowning: `:person_frowning:` | :bow: `:bow:` |
| :couplekiss: `:couplekiss:` | :couple_with_heart: `:couple_with_heart:` | :massage: `:massage:` |
| :haircut: `:haircut:` | :nail_care: `:nail_care:` | :boy: `:boy:` |
| :girl: `:girl:` | :woman: `:woman:` | :man: `:man:` |
| :baby: `:baby:` | :older_woman: `:older_woman:` | :older_man: `:older_man:` |
| :person_with_blond_hair: `:person_with_blond_hair:` | :man_with_gua_pi_mao: `:man_with_gua_pi_mao:` | :man_with_turban: `:man_with_turban:` |
| :construction_worker: `:construction_worker:` | :cop: `:cop:` | :angel: `:angel:` |
| :princess: `:princess:` | :smiley_cat: `:smiley_cat:` | :smile_cat: `:smile_cat:` |
| :heart_eyes_cat: `:heart_eyes_cat:` | :kissing_cat: `:kissing_cat:` | :smirk_cat: `:smirk_cat:` |
| :scream_cat: `:scream_cat:` | :crying_cat_face: `:crying_cat_face:` | :joy_cat: `:joy_cat:` |
| :pouting_cat: `:pouting_cat:` | :japanese_ogre: `:japanese_ogre:` | :japanese_goblin: `:japanese_goblin:` |
| :see_no_evil: `:see_no_evil:` | :hear_no_evil: `:hear_no_evil:` | :speak_no_evil: `:speak_no_evil:` |
| :guardsman: `:guardsman:` | :skull: `:skull:` | :feet: `:feet:` |
| :lips: `:lips:` | :kiss: `:kiss:` | :droplet: `:droplet:` |
| :ear: `:ear:` | :eyes: `:eyes:` | :nose: `:nose:` |
| :tongue: `:tongue:` | :love_letter: `:love_letter:` | :bust_in_silhouette: `:bust_in_silhouette:` |
| :busts_in_silhouette: `:busts_in_silhouette:` | :speech_balloon: `:speech_balloon:` | :thought_balloon: `:thought_balloon:` |
| :feelsgood: `:feelsgood:` | :finnadie: `:finnadie:` | :goberserk: `:goberserk:` |
| :godmode: `:godmode:` | :hurtrealbad: `:hurtrealbad:` | :rage1: `:rage1:` |
| :rage2: `:rage2:` | :rage3: `:rage3:` | :rage4: `:rage4:` |
| :suspect: `:suspect:` | :trollface: `:trollface:` | 

Nature

| :sunny: `:sunny:` | :umbrella: `:umbrella:` | :cloud: `:cloud:` |
|---|---|---|
| :snowflake: `:snowflake:` | :snowman: `:snowman:` | :zap: `:zap:` |
| :cyclone: `:cyclone:` | :foggy: `:foggy:` | :ocean: `:ocean:` |
| :cat: `:cat:` | :dog: `:dog:` | :mouse: `:mouse:` |
| :hamster: `:hamster:` | :rabbit: `:rabbit:` | :wolf: `:wolf:` |
| :frog: `:frog:` | :tiger: `:tiger:` | :koala: `:koala:` |
| :bear: `:bear:` | :pig: `:pig:` | :pig_nose: `:pig_nose:` |
| :cow: `:cow:` | :boar: `:boar:` | :monkey_face: `:monkey_face:` |
| :monkey: `:monkey:` | :horse: `:horse:` | :racehorse: `:racehorse:` |
| :camel: `:camel:` | :sheep: `:sheep:` | :elephant: `:elephant:` |
| :panda_face: `:panda_face:` | :snake: `:snake:` | :bird: `:bird:` |
| :baby_chick: `:baby_chick:` | :hatched_chick: `:hatched_chick:` | :hatching_chick: `:hatching_chick:` |
| :chicken: `:chicken:` | :penguin: `:penguin:` | :turtle: `:turtle:` |
| :bug: `:bug:` | :honeybee: `:honeybee:` | :ant: `:ant:` |
| :beetle: `:beetle:` | :snail: `:snail:` | :octopus: `:octopus:` |
| :tropical_fish: `:tropical_fish:` | :fish: `:fish:` | :whale: `:whale:` |
| :whale2: `:whale2:` | :dolphin: `:dolphin:` | :cow2: `:cow2:` |
| :ram: `:ram:` | :rat: `:rat:` | :water_buffalo: `:water_buffalo:` |
| :tiger2: `:tiger2:` | :rabbit2: `:rabbit2:` | :dragon: `:dragon:` |
| :goat: `:goat:` | :rooster: `:rooster:` | :dog2: `:dog2:` |
| :pig2: `:pig2:` | :mouse2: `:mouse2:` | :ox: `:ox:` |
| :dragon_face: `:dragon_face:` | :blowfish: `:blowfish:` | :crocodile: `:crocodile:` |
| :dromedary_camel: `:dromedary_camel:` | :leopard: `:leopard:` | :cat2: `:cat2:` |
| :poodle: `:poodle:` | :paw_prints: `:paw_prints:` | :bouquet: `:bouquet:` |
| :cherry_blossom: `:cherry_blossom:` | :tulip: `:tulip:` | :four_leaf_clover: `:four_leaf_clover:` |
| :rose: `:rose:` | :sunflower: `:sunflower:` | :hibiscus: `:hibiscus:` |
| :maple_leaf: `:maple_leaf:` | :leaves: `:leaves:` | :fallen_leaf: `:fallen_leaf:` |
| :herb: `:herb:` | :mushroom: `:mushroom:` | :cactus: `:cactus:` |
| :palm_tree: `:palm_tree:` | :evergreen_tree: `:evergreen_tree:` | :deciduous_tree: `:deciduous_tree:` |
| :chestnut: `:chestnut:` | :seedling: `:seedling:` | :blossom: `:blossom:` |
| :ear_of_rice: `:ear_of_rice:` | :shell: `:shell:` | :globe_with_meridians: `:globe_with_meridians:` |
| :sun_with_face: `:sun_with_face:` | :full_moon_with_face: `:full_moon_with_face:` | :new_moon_with_face: `:new_moon_with_face:` |
| :new_moon: `:new_moon:` | :waxing_crescent_moon: `:waxing_crescent_moon:` | :first_quarter_moon: `:first_quarter_moon:` |
| :waxing_gibbous_moon: `:waxing_gibbous_moon:` | :full_moon: `:full_moon:` | :waning_gibbous_moon: `:waning_gibbous_moon:` |
| :last_quarter_moon: `:last_quarter_moon:` | :waning_crescent_moon: `:waning_crescent_moon:` | :last_quarter_moon_with_face: `:last_quarter_moon_with_face:` |
| :first_quarter_moon_with_face: `:first_quarter_moon_with_face:` | :moon: `:moon:` | :earth_africa: `:earth_africa:` |
| :earth_americas: `:earth_americas:` | :earth_asia: `:earth_asia:` | :volcano: `:volcano:` |
| :milky_way: `:milky_way:` | :partly_sunny: `:partly_sunny:` | :octocat: `:octocat:` |
| :squirrel: `:squirrel:` |

Objects

| :bamboo: `:bamboo:` | :gift_heart: `:gift_heart:` | :dolls: `:dolls:` |
|---|---|---|
| :school_satchel: `:school_satchel:` | :mortar_board: `:mortar_board:` | :flags: `:flags:` |
| :fireworks: `:fireworks:` | :sparkler: `:sparkler:` | :wind_chime: `:wind_chime:` |
| :rice_scene: `:rice_scene:` | :jack_o_lantern: `:jack_o_lantern:` | :ghost: `:ghost:` |
| :santa: `:santa:` | :christmas_tree: `:christmas_tree:` | :gift: `:gift:` |
| :bell: `:bell:` | :no_bell: `:no_bell:` | :tanabata_tree: `:tanabata_tree:` |
| :tada: `:tada:` | :confetti_ball: `:confetti_ball:` | :balloon: `:balloon:` |
| :crystal_ball: `:crystal_ball:` | :cd: `:cd:` | :dvd: `:dvd:` |
| :floppy_disk: `:floppy_disk:` | :camera: `:camera:` | :video_camera: `:video_camera:` |
| :movie_camera: `:movie_camera:` | :computer: `:computer:` | :tv: `:tv:` |
| :iphone: `:iphone:` | :phone: `:phone:` | :telephone: `:telephone:` |
| :telephone_receiver: `:telephone_receiver:` | :pager: `:pager:` | :fax: `:fax:` |
| :minidisc: `:minidisc:` | :vhs: `:vhs:` | :sound: `:sound:` |
| :speaker: `:speaker:` | :mute: `:mute:` | :loudspeaker: `:loudspeaker:` |
| :mega: `:mega:` | :hourglass: `:hourglass:` | :hourglass_flowing_sand: `:hourglass_flowing_sand:` |
| :alarm_clock: `:alarm_clock:` | :watch: `:watch:` | :radio: `:radio:` |
| :satellite: `:satellite:` | :loop: `:loop:` | :mag: `:mag:` |
| :mag_right: `:mag_right:` | :unlock: `:unlock:` | :lock: `:lock:` |
| :lock_with_ink_pen: `:lock_with_ink_pen:` | :closed_lock_with_key: `:closed_lock_with_key:` | :key: `:key:` |
| :bulb: `:bulb:` | :flashlight: `:flashlight:` | :high_brightness: `:high_brightness:` |
| :low_brightness: `:low_brightness:` | :electric_plug: `:electric_plug:` | :battery: `:battery:` |
| :calling: `:calling:` | :email: `:email:` | :mailbox: `:mailbox:` |
| :postbox: `:postbox:` | :bath: `:bath:` | :bathtub: `:bathtub:` |
| :shower: `:shower:` | :toilet: `:toilet:` | :wrench: `:wrench:` |
| :nut_and_bolt: `:nut_and_bolt:` | :hammer: `:hammer:` | :seat: `:seat:` |
| :moneybag: `:moneybag:` | :yen: `:yen:` | :dollar: `:dollar:` |
| :pound: `:pound:` | :euro: `:euro:` | :credit_card: `:credit_card:` |
| :money_with_wings: `:money_with_wings:` | :e-mail: `:e-mail:` | :inbox_tray: `:inbox_tray:` |
| :outbox_tray: `:outbox_tray:` | :envelope: `:envelope:` | :incoming_envelope: `:incoming_envelope:` |
| :postal_horn: `:postal_horn:` | :mailbox_closed: `:mailbox_closed:` | :mailbox_with_mail: `:mailbox_with_mail:` |
| :mailbox_with_no_mail: `:mailbox_with_no_mail:` | :door: `:door:` | :smoking: `:smoking:` |
| :bomb: `:bomb:` | :gun: `:gun:` | :hocho: `:hocho:` |
| :pill: `:pill:` | :syringe: `:syringe:` | :page_facing_up: `:page_facing_up:` |
| :page_with_curl: `:page_with_curl:` | :bookmark_tabs: `:bookmark_tabs:` | :bar_chart: `:bar_chart:` |
| :chart_with_upwards_trend: `:chart_with_upwards_trend:` | :chart_with_downwards_trend: `:chart_with_downwards_trend:` | :scroll: `:scroll:` |
| :clipboard: `:clipboard:` | :calendar: `:calendar:` | :date: `:date:` |
| :card_index: `:card_index:` | :file_folder: `:file_folder:` | :open_file_folder: `:open_file_folder:` |
| :scissors: `:scissors:` | :pushpin: `:pushpin:` | :paperclip: `:paperclip:` |
| :black_nib: `:black_nib:` | :pencil2: `:pencil2:` | :straight_ruler: `:straight_ruler:` |
| :triangular_ruler: `:triangular_ruler:` | :closed_book: `:closed_book:` | :green_book: `:green_book:` |
| :blue_book: `:blue_book:` | :orange_book: `:orange_book:` | :notebook: `:notebook:` |
| :notebook_with_decorative_cover: `:notebook_with_decorative_cover:` | :ledger: `:ledger:` | :books: `:books:` |
| :bookmark: `:bookmark:` | :name_badge: `:name_badge:` | :microscope: `:microscope:` |
| :telescope: `:telescope:` | :newspaper: `:newspaper:` | :football: `:football:` |
| :basketball: `:basketball:` | :soccer: `:soccer:` | :baseball: `:baseball:` |
| :tennis: `:tennis:` | :8ball: `:8ball:` | :rugby_football: `:rugby_football:` |
| :bowling: `:bowling:` | :golf: `:golf:` | :mountain_bicyclist: `:mountain_bicyclist:` |
| :bicyclist: `:bicyclist:` | :horse_racing: `:horse_racing:` | :snowboarder: `:snowboarder:` |
| :swimmer: `:swimmer:` | :surfer: `:surfer:` | :ski: `:ski:` |
| :spades: `:spades:` | :hearts: `:hearts:` | :clubs: `:clubs:` |
| :diamonds: `:diamonds:` | :gem: `:gem:` | :ring: `:ring:` |
| :trophy: `:trophy:` | :musical_score: `:musical_score:` | :musical_keyboard: `:musical_keyboard:` |
| :violin: `:violin:` | :space_invader: `:space_invader:` | :video_game: `:video_game:` |
| :black_joker: `:black_joker:` | :flower_playing_cards: `:flower_playing_cards:` | :game_die: `:game_die:` |
| :dart: `:dart:` | :mahjong: `:mahjong:` | :clapper: `:clapper:` |
| :memo: `:memo:` | :pencil: `:pencil:` | :book: `:book:` |
| :art: `:art:` | :microphone: `:microphone:` | :headphones: `:headphones:` |
| :trumpet: `:trumpet:` | :saxophone: `:saxophone:` | :guitar: `:guitar:` |
| :shoe: `:shoe:` | :sandal: `:sandal:` | :high_heel: `:high_heel:` |
| :lipstick: `:lipstick:` | :boot: `:boot:` | :shirt: `:shirt:` |
| :tshirt: `:tshirt:` | :necktie: `:necktie:` | :womans_clothes: `:womans_clothes:` |
| :dress: `:dress:` | :running_shirt_with_sash: `:running_shirt_with_sash:` | :jeans: `:jeans:` |
| :kimono: `:kimono:` | :bikini: `:bikini:` | :ribbon: `:ribbon:` |
| :tophat: `:tophat:` | :crown: `:crown:` | :womans_hat: `:womans_hat:` |
| :mans_shoe: `:mans_shoe:` | :closed_umbrella: `:closed_umbrella:` | :briefcase: `:briefcase:` |
| :handbag: `:handbag:` | :pouch: `:pouch:` | :purse: `:purse:` |
| :eyeglasses: `:eyeglasses:` | :fishing_pole_and_fish: `:fishing_pole_and_fish:` | :coffee: `:coffee:` |
| :tea: `:tea:` | :sake: `:sake:` | :baby_bottle: `:baby_bottle:` |
| :beer: `:beer:` | :beers: `:beers:` | :cocktail: `:cocktail:` |
| :tropical_drink: `:tropical_drink:` | :wine_glass: `:wine_glass:` | :fork_and_knife: `:fork_and_knife:` |
| :pizza: `:pizza:` | :hamburger: `:hamburger:` | :fries: `:fries:` |
| :poultry_leg: `:poultry_leg:` | :meat_on_bone: `:meat_on_bone:` | :spaghetti: `:spaghetti:` |
| :curry: `:curry:` | :fried_shrimp: `:fried_shrimp:` | :bento: `:bento:` |
| :sushi: `:sushi:` | :fish_cake: `:fish_cake:` | :rice_ball: `:rice_ball:` |
| :rice_cracker: `:rice_cracker:` | :rice: `:rice:` | :ramen: `:ramen:` |
| :stew: `:stew:` | :oden: `:oden:` | :dango: `:dango:` |
| :egg: `:egg:` | :bread: `:bread:` | :doughnut: `:doughnut:` |
| :custard: `:custard:` | :icecream: `:icecream:` | :ice_cream: `:ice_cream:` |
| :shaved_ice: `:shaved_ice:` | :birthday: `:birthday:` | :cake: `:cake:` |
| :cookie: `:cookie:` | :chocolate_bar: `:chocolate_bar:` | :candy: `:candy:` |
| :lollipop: `:lollipop:` | :honey_pot: `:honey_pot:` | :apple: `:apple:` |
| :green_apple: `:green_apple:` | :tangerine: `:tangerine:` | :lemon: `:lemon:` |
| :cherries: `:cherries:` | :grapes: `:grapes:` | :watermelon: `:watermelon:` |
| :strawberry: `:strawberry:` | :peach: `:peach:` | :melon: `:melon:` |
| :banana: `:banana:` | :pear: `:pear:` | :pineapple: `:pineapple:` |
| :sweet_potato: `:sweet_potato:` | :eggplant: `:eggplant:` | :tomato: `:tomato:` |
| :corn: `:corn:` |

Places

| :house: `:house:` | :house_with_garden: `:house_with_garden:` | :school: `:school:` |
|---|---|---|
| :office: `:office:` | :post_office: `:post_office:` | :hospital: `:hospital:` |
| :bank: `:bank:` | :convenience_store: `:convenience_store:` | :love_hotel: `:love_hotel:` |
| :hotel: `:hotel:` | :wedding: `:wedding:` | :church: `:church:` |
| :department_store: `:department_store:` | :european_post_office: `:european_post_office:` | :city_sunrise: `:city_sunrise:` |
| :city_sunset: `:city_sunset:` | :japanese_castle: `:japanese_castle:` | :european_castle: `:european_castle:` |
| :tent: `:tent:` | :factory: `:factory:` | :tokyo_tower: `:tokyo_tower:` |
| :japan: `:japan:` | :mount_fuji: `:mount_fuji:` | :sunrise_over_mountains: `:sunrise_over_mountains:` |
| :sunrise: `:sunrise:` | :stars: `:stars:` | :statue_of_liberty: `:statue_of_liberty:` |
| :bridge_at_night: `:bridge_at_night:` | :carousel_horse: `:carousel_horse:` | :rainbow: `:rainbow:` |
| :ferris_wheel: `:ferris_wheel:` | :fountain: `:fountain:` | :roller_coaster: `:roller_coaster:` |
| :ship: `:ship:` | :speedboat: `:speedboat:` | :boat: `:boat:` |
| :sailboat: `:sailboat:` | :rowboat: `:rowboat:` | :anchor: `:anchor:` |
| :rocket: `:rocket:` | :airplane: `:airplane:` | :helicopter: `:helicopter:` |
| :steam_locomotive: `:steam_locomotive:` | :tram: `:tram:` | :mountain_railway: `:mountain_railway:` |
| :bike: `:bike:` | :aerial_tramway: `:aerial_tramway:` | :suspension_railway: `:suspension_railway:` |
| :mountain_cableway: `:mountain_cableway:` | :tractor: `:tractor:` | :blue_car: `:blue_car:` |
| :oncoming_automobile: `:oncoming_automobile:` | :car: `:car:` | :red_car: `:red_car:` |
| :taxi: `:taxi:` | :oncoming_taxi: `:oncoming_taxi:` | :articulated_lorry: `:articulated_lorry:` |
| :bus: `:bus:` | :oncoming_bus: `:oncoming_bus:` | :rotating_light: `:rotating_light:` |
| :police_car: `:police_car:` | :oncoming_police_car: `:oncoming_police_car:` | :fire_engine: `:fire_engine:` |
| :ambulance: `:ambulance:` | :minibus: `:minibus:` | :truck: `:truck:` |
| :train: `:train:` | :station: `:station:` | :train2: `:train2:` |
| :bullettrain_front: `:bullettrain_front:` | :bullettrain_side: `:bullettrain_side:` | :light_rail: `:light_rail:` |
| :monorail: `:monorail:` | :railway_car: `:railway_car:` | :trolleybus: `:trolleybus:` |
| :ticket: `:ticket:` | :fuelpump: `:fuelpump:` | :vertical_traffic_light: `:vertical_traffic_light:` |
| :traffic_light: `:traffic_light:` | :warning: `:warning:` | :construction: `:construction:` |
| :beginner: `:beginner:` | :atm: `:atm:` | :slot_machine: `:slot_machine:` |
| :busstop: `:busstop:` | :barber: `:barber:` | :hotsprings: `:hotsprings:` |
| :checkered_flag: `:checkered_flag:` | :crossed_flags: `:crossed_flags:` | :izakaya_lantern: `:izakaya_lantern:` |
| :moyai: `:moyai:` | :circus_tent: `:circus_tent:` | :performing_arts: `:performing_arts:` |
| :round_pushpin: `:round_pushpin:` | :triangular_flag_on_post: `:triangular_flag_on_post:` | :jp: `:jp:` |
| :kr: `:kr:` | :cn: `:cn:` | :us: `:us:` |
| :fr: `:fr:` | :es: `:es:` | :it: `:it:` |
| :ru: `:ru:` | :gb: `:gb:` | :uk: `:uk:` |
| :de: `:de:` |

Symbols

| :one: `:one:` | :two: `:two:` | :three: `:three:` |
|---|---|---|
| :four: `:four:` | :five: `:five:` | :six: `:six:` |
| :seven: `:seven:` | :eight: `:eight:` | :nine: `:nine:` |
| :keycap_ten: `:keycap_ten:` | :1234: `:1234:` | :zero: `:zero:` |
| :hash: `:hash:` | :symbols: `:symbols:` | :arrow_backward: `:arrow_backward:` |
| :arrow_down: `:arrow_down:` | :arrow_forward: `:arrow_forward:` | :arrow_left: `:arrow_left:` |
| :capital_abcd: `:capital_abcd:` | :abcd: `:abcd:` | :abc: `:abc:` |
| :arrow_lower_left: `:arrow_lower_left:` | :arrow_lower_right: `:arrow_lower_right:` | :arrow_right: `:arrow_right:` |
| :arrow_up: `:arrow_up:` | :arrow_upper_left: `:arrow_upper_left:` | :arrow_upper_right: `:arrow_upper_right:` |
| :arrow_double_down: `:arrow_double_down:` | :arrow_double_up: `:arrow_double_up:` | :arrow_down_small: `:arrow_down_small:` |
| :arrow_heading_down: `:arrow_heading_down:` | :arrow_heading_up: `:arrow_heading_up:` | :leftwards_arrow_with_hook: `:leftwards_arrow_with_hook:` |
| :arrow_right_hook: `:arrow_right_hook:` | :left_right_arrow: `:left_right_arrow:` | :arrow_up_down: `:arrow_up_down:` |
| :arrow_up_small: `:arrow_up_small:` | :arrows_clockwise: `:arrows_clockwise:` | :arrows_counterclockwise: `:arrows_counterclockwise:` |
| :rewind: `:rewind:` | :fast_forward: `:fast_forward:` | :information_source: `:information_source:` |
| :ok: `:ok:` | :twisted_rightwards_arrows: `:twisted_rightwards_arrows:` | :repeat: `:repeat:` |
| :repeat_one: `:repeat_one:` | :new: `:new:` | :top: `:top:` |
| :up: `:up:` | :cool: `:cool:` | :free: `:free:` |
| :ng: `:ng:` | :cinema: `:cinema:` | :koko: `:koko:` |
| :signal_strength: `:signal_strength:` | :u5272: `:u5272:` | :u5408: `:u5408:` |
| :u55b6: `:u55b6:` | :u6307: `:u6307:` | :u6708: `:u6708:` |
| :u6709: `:u6709:` | :u6e80: `:u6e80:` | :u7121: `:u7121:` |
| :u7533: `:u7533:` | :u7a7a: `:u7a7a:` | :u7981: `:u7981:` |
| :sa: `:sa:` | :restroom: `:restroom:` | :mens: `:mens:` |
| :womens: `:womens:` | :baby_symbol: `:baby_symbol:` | :no_smoking: `:no_smoking:` |
| :parking: `:parking:` | :wheelchair: `:wheelchair:` | :metro: `:metro:` |
| :baggage_claim: `:baggage_claim:` | :accept: `:accept:` | :wc: `:wc:` |
| :potable_water: `:potable_water:` | :put_litter_in_its_place: `:put_litter_in_its_place:` | :secret: `:secret:` |
| :congratulations: `:congratulations:` | :m: `:m:` | :passport_control: `:passport_control:` |
| :left_luggage: `:left_luggage:` | :customs: `:customs:` | :ideograph_advantage: `:ideograph_advantage:` |
| :cl: `:cl:` | :sos: `:sos:` | :id: `:id:` |
| :no_entry_sign: `:no_entry_sign:` | :underage: `:underage:` | :no_mobile_phones: `:no_mobile_phones:` |
| :do_not_litter: `:do_not_litter:` | :non-potable_water: `:non-potable_water:` | :no_bicycles: `:no_bicycles:` |
| :no_pedestrians: `:no_pedestrians:` | :children_crossing: `:children_crossing:` | :no_entry: `:no_entry:` |
| :eight_spoked_asterisk: `:eight_spoked_asterisk:` | :eight_pointed_black_star: `:eight_pointed_black_star:` | :heart_decoration: `:heart_decoration:` |
| :vs: `:vs:` | :vibration_mode: `:vibration_mode:` | :mobile_phone_off: `:mobile_phone_off:` |
| :chart: `:chart:` | :currency_exchange: `:currency_exchange:` | :aries: `:aries:` |
| :taurus: `:taurus:` | :gemini: `:gemini:` | :cancer: `:cancer:` |
| :leo: `:leo:` | :virgo: `:virgo:` | :libra: `:libra:` |
| :scorpius: `:scorpius:` | :sagittarius: `:sagittarius:` | :capricorn: `:capricorn:` |
| :aquarius: `:aquarius:` | :pisces: `:pisces:` | :ophiuchus: `:ophiuchus:` |
| :six_pointed_star: `:six_pointed_star:` | :negative_squared_cross_mark: `:negative_squared_cross_mark:` | :a: `:a:` |
| :b: `:b:` | :ab: `:ab:` | :o2: `:o2:` |
| :diamond_shape_with_a_dot_inside: `:diamond_shape_with_a_dot_inside:` | :recycle: `:recycle:` | :end: `:end:` |
| :on: `:on:` | :soon: `:soon:` | :clock1: `:clock1:` |
| :clock130: `:clock130:` | :clock10: `:clock10:` | :clock1030: `:clock1030:` |
| :clock11: `:clock11:` | :clock1130: `:clock1130:` | :clock12: `:clock12:` |
| :clock1230: `:clock1230:` | :clock2: `:clock2:` | :clock230: `:clock230:` |
| :clock3: `:clock3:` | :clock330: `:clock330:` | :clock4: `:clock4:` |
| :clock430: `:clock430:` | :clock5: `:clock5:` | :clock530: `:clock530:` |
| :clock6: `:clock6:` | :clock630: `:clock630:` | :clock7: `:clock7:` |
| :clock730: `:clock730:` | :clock8: `:clock8:` | :clock830: `:clock830:` |
| :clock9: `:clock9:` | :clock930: `:clock930:` | :heavy_dollar_sign: `:heavy_dollar_sign:` |
| :copyright: `:copyright:` | :registered: `:registered:` | :tm: `:tm:` |
| :x: `:x:` | :heavy_exclamation_mark: `:heavy_exclamation_mark:` | :bangbang: `:bangbang:` |
| :interrobang: `:interrobang:` | :o: `:o:` | :heavy_multiplication_x: `:heavy_multiplication_x:` |
| :heavy_plus_sign: `:heavy_plus_sign:` | :heavy_minus_sign: `:heavy_minus_sign:` | :heavy_division_sign: `:heavy_division_sign:` |
| :white_flower: `:white_flower:` | :100: `:100:` | :heavy_check_mark: `:heavy_check_mark:` |
| :ballot_box_with_check: `:ballot_box_with_check:` | :radio_button: `:radio_button:` | :link: `:link:` |
| :curly_loop: `:curly_loop:` | :wavy_dash: `:wavy_dash:` | :part_alternation_mark: `:part_alternation_mark:` |
| :trident: `:trident:` | :black_square: `:black_square:` | :white_square: `:white_square:` |
| :white_check_mark: `:white_check_mark:` | :black_square_button: `:black_square_button:` | :white_square_button: `:white_square_button:` |
| :black_circle: `:black_circle:` | :white_circle: `:white_circle:` | :red_circle: `:red_circle:` |
| :large_blue_circle: `:large_blue_circle:` | :large_blue_diamond: `:large_blue_diamond:` | :large_orange_diamond: `:large_orange_diamond:` |
| :small_blue_diamond: `:small_blue_diamond:` | :small_orange_diamond: `:small_orange_diamond:` | :small_red_triangle: `:small_red_triangle:` |
| :small_red_triangle_down: `:small_red_triangle_down:` | :shipit: `:shipit:` |



[1]: https://www.eff.org/ "It's cool!!"
[linkRG]: https://refactoring.guru/ "It's really cool!!"

[^1]: Esta sería la nota a pie de página del ejemplo.
[^notaPie1]: Otra nota donde además podemos añadir más párrafos indentándolos bajo esta etiqueta.
    Para muestra este botón que puede incluir párrafos normales...
    
    `{ código... }`

    Y un largo etcétera.
