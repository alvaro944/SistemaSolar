# CuerpoCeleste

Este proyecto contiene la implementación de una clase Java llamada `CuerpoCeleste`, que representa cuerpos celestes como planetas, lunas, estrellas, cometas y asteroides. La clase permite almacenar información sobre su nombre, período orbital, tipo y satélites asociados.

## Estructura de la Clase

### Enumeración `TipoCuerpoCeleste`

La clase contiene una enumeración interna para representar los diferentes tipos de cuerpos celestes:

- `ESTRELLA`
- `PLANETA`
- `PLANETA_ENANO`
- `LUNA`
- `COMETA`
- `ASTEROIDE`

### Atributos

- `nombre`: Nombre del cuerpo celeste (tipo `String`).
- `periodoOrbital`: Período orbital en días o años (tipo `double`).
- `satelites`: Un conjunto (`Set`) de satélites asociados al cuerpo celeste.
- `tipoCuerpo`: Tipo del cuerpo celeste basado en la enumeración `TipoCuerpoCeleste`.

### Constructor

```java
public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo)
```

Crea una nueva instancia de `CuerpoCeleste` con el nombre, el período orbital y el tipo de cuerpo especificado. Inicializa el conjunto de satélites como un `HashSet`.

### Métodos

#### `getNombre()`
```java
public String getNombre()
```
Devuelve el nombre del cuerpo celeste.

#### `getPeriodoOrbital()`
```java
public double getPeriodoOrbital()
```
Devuelve el período orbital del cuerpo celeste.

#### `getTipoCuerpo()`
```java
public TipoCuerpoCeleste getTipoCuerpo()
```
Devuelve el tipo de cuerpo celeste.

#### `getSatelites()`
```java
public Set<CuerpoCeleste> getSatelites()
```
Devuelve una copia del conjunto de satélites.

#### `addSatelites()`
```java
public boolean addSatelites(CuerpoCeleste cuerpoCeleste)
```
Agrega un satélite al conjunto de satélites. Retorna `true` si el satélite fue agregado con éxito, de lo contrario, retorna `false`.

#### Sobrescritura de `equals()`

```java
@Override
public boolean equals(Object o)
```
Compara dos objetos `CuerpoCeleste` basado en el nombre y el tipo de cuerpo celeste.

#### Sobrescritura de `hashCode()`

```java
@Override
public int hashCode()
```
Genera un valor hash basado en el nombre y el tipo de cuerpo, con un número constante para evitar colisiones de hash.

#### Sobrescritura de `toString()`

```java
@Override
public String toString()
```
Devuelve una representación en forma de cadena del cuerpo celeste, mostrando el nombre, tipo y período orbital.

### Ejemplo de Uso

```java
public static void main(String[] args) {
    CuerpoCeleste tierra = new CuerpoCeleste("Tierra", 365.25, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
    CuerpoCeleste luna = new CuerpoCeleste("Luna", 27.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);

    tierra.addSatelites(luna);

    System.out.println(tierra);
    System.out.println("Satélites: " + tierra.getSatelites());
}
```

### Salida esperada:

```plaintext
Tierra: PLANETA, periodo orbital: 365.25
Satélites: [Luna: LUNA, periodo orbital: 27.3]
```

## Requisitos

- Java 8 o superior.

## Ejecución

Compila el archivo `.java`:

```bash
javac CuerpoCeleste.java
```

Ejecuta el programa:

```bash
java CuerpoCeleste
```

## Licencia

Este proyecto está licenciado bajo la licencia MIT.
