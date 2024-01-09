package exercises11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class T1111_Write1 {
	public static void main(String[] args) throws IOException {
/* In Java, `FileWriter` and `BufferedWriter` are classes used for writing data to files. They are part of the `java.io` package and provide functionalities to write characters or strings to files.

### `FileWriter`

`FileWriter` is a class used to write characters to a file. It provides a convenient way to write text data to a file by converting characters into bytes using the system's default character encoding.

#### Basic usage of `FileWriter`:

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write("Hello, FileWriter!");
            // You can also use fileWriter.append("Text") for appending to the file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

In this example:
- We create a `FileWriter` object and specify the filename "output.txt".
- We use the `write` method to write the string "Hello, FileWriter!" to the file.
- The `try-with-resources` statement is used to automatically close the `FileWriter` after it's done.

### `BufferedWriter`

`BufferedWriter` is a class that provides buffering for the `Writer` classes, such as `FileWriter`, which improves the efficiency of writing to a file by reducing the number of I/O operations.

#### Basic usage of `BufferedWriter`:

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
            bufferedWriter.write("Hello, BufferedWriter!");
            // You can also use bufferedWriter.newLine() to insert a new line
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

In this example:
- We create a `BufferedWriter` by wrapping a `FileWriter` object with it.
- We use the `write` method to write the string "Hello, BufferedWriter!" to the file.
- Similar to `FileWriter`, the `try-with-resources` statement automatically closes the `BufferedWriter` after use.

### Key Points:
- `FileWriter` writes directly to a file, converting characters to bytes based on the system's default character encoding.
- `BufferedWriter` improves performance by buffering data in memory before writing to the file, reducing the number of write operations.
- Both classes provide methods for writing strings, characters, and appending data to files.

It's important to handle exceptions (like `IOException`) that may occur during file operations and to close the file writers properly to release resources. Using try-with-resources as shown in the examples helps with the proper closing of these resources after use.*/
		String a, b, c;
		a = "Lukas";
		b = "Hamburger";
		c = "Burritos";

		FileWriter fw = new FileWriter("text.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(a);
		bw.newLine();

		bw.write(b);
		bw.newLine();

		bw.write(c);
		bw.newLine();
		// A text file called text.txt gets generated. But the content is still empty.

		bw.flush();
		// Now The text file has the strings contents inside. Apparently the point of a
		// buffer is to buffer the data until it is full or you tell it that you want to
		// write.

		bw.close(); // I'm keeping bw.flush just to show what I did.

	}

}
