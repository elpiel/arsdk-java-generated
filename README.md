# Reference JAVA code generated for Parrot drones

The xml files and the generic generator can be found in the [Parrot-Developers/arsdk-xml][arsdk-xml] here:

* XML files: https://github.com/Parrot-Developers/arsdk-xml/tree/master/xml
* Generator: https://github.com/Parrot-Developers/arsdk-xml/tree/master/arsdkgen.py

The generators files can be found in the [`Parrot-Developers/groundsdk-android`][groundsdk-android] here:



## Steps:

1. Clone [`arsdk-xml`][arsdk-xml]
2. Clone [`groundsdk-android`][groundsdk-android]

3. Make `arsdkgen.py` executable

```bash
chmod +x ./PATH/TO/arsdk-xml/arsdkgen.py
```

`arsdkgen.py` options (for more information pass the `--help` option):
* `-o` - output directory

4. Run generator

## Running the generator

### 1. Generate Features

```bash
./PATH/TO/arsdk-xml/arsdkgen.py ./PATH/TO/groundsdk-android/sdkcore/arsdkgenjava.py -o java
```

### 2. Generate JNI (?! not sure what it's used for)

```bash
./PATH/TO/arsdk-xml/arsdkgen.py ./PATH/TO/groundsdk-android/sdkcore/arsdkgenjni.py -o java javajni
```

### 3. Generate Tests

```bash
./PATH/TO/arsdk-xml/arsdkgen.py ./PATH/TO/groundsdk-android/sdkcore/arsdkgenjavatests.py -o java javatests
```

[groundsdk-android]: https://github.com/Parrot-Developers/groundsdk-android
[arsdk-xml]: https://github.com/Parrot-Developers/arsdk-xml
