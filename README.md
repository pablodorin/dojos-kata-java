# 🥋 Dojo Java

A repository of Java practice exercises (katas), organized by level and focused on clean code, automated testing with JUnit, and execution using Maven.

--
## 🧑‍💻 Author

**Pablo Dorin**  
GitHub: [@Z3N1T](https://github.com/Z3N1T)


---

## ✅ Project Goals

- Practice problem-solving in Java
- Properly structure a Maven project
- Consolidate automated testing with JUnit
- Prepare for real-world technical interviews
- Maintain a clear progression with kata-based commits

---

## 🤖 Automation (Coming Soon)

✔️ Ready to integrate with GitHub Actions  
🚧 Coming up: CI to automatically validate all tests on every push

---

## 📦 Project Structure

```bash
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       ├── kata01_removing
│   │       │   └── Remover.java
│   │       └── kata02_sortStrings
│   │           └── Sorter.java
│   └── test
│       └── java
│           ├── kata01_removing
│           │   └── RemoverTest.java
│           └── kata02_sortStrings
│               └── SorterTest.java
🚀 How to Run Tests
From the project root, run:

bash
Copiar
Editar
mvn clean test
This will compile the source code and run all JUnit 5 tests.

🧪 Key Dependencies (pom.xml)
xml
Copiar
Editar
<dependencies>
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.2</version>
    <scope>test</scope>
  </dependency>
</dependencies>

<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>3.1.2</version>
      <configuration>
        <useModulePath>false</useModulePath>
      </configuration>
    </plugin>
  </plugins>
</build>
📁 Folder Convention
Each new exercise (kata) is placed in its own folder using the format:

Copiar
Editar
kataXX_name/
Examples:

kata01_removing

kata02_sortStrings

kata03_template (template for new exercises)

📌 Template for New Katas (kata03_template)
Recommended structure:
bash
Copiar
Editar
src/
├── main/java/kata03_template/
│   └── ClassName.java
└── test/java/kata03_template/
    └── ClassNameTest.java
Minimum content:
java
Copiar
Editar
// src/main/java/kata03_template/ClassName.java
package kata03_template;

public class ClassName {
    public static Object solve(Object input) {
        return input; // logic goes here
    }
}
java
Copiar
Editar
// src/test/java/kata03_template/ClassNameTest.java
package kata03_template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassNameTest {
    @Test
    public void testSolve() {
        assertEquals("Expected", ClassName.solve("Input"));
    }
}
