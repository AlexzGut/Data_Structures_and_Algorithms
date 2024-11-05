# Data Structures and Algorithms

Welcome to the **Data Structures and Algorithms** repository! This repository is dedicated to my journey in mastering data structures and algorithms. The goal is to strengthen my problem-solving skills, gain a deeper understanding of different data structures, and prepare for coding interviews.

## Repository Structure

The repository is organized into two main categories: **Data Structures** and **Algorithms**. Each category is further divided into subfolders that contain specific implementations.

   ```bash
    Data_Structures_and_Algorithms/ 
   ├── src/
   │   ├── main/
   │   │   └── java/
   │   │       └── com/
   │   │           └── alexzgut/
   │   │               └── dsa/
   │   │                   ├── DataStructures/
   │   │                   └── Algorithms/
   │   └── test/
   │       └── java/
   │           └── com/
   │               └── alexzgut/
   │                   └── dsa/
   │                       └── tests/
   ├── pom.xml
   ├── README.md
   └── LICENSE 
   ```

### Folders and Content

- **DataStructures**: This directory contains implementations of various data structures. Each data structure has its own folder with specific code files.
  
- **Algorithms**: This directory includes different categories of algorithms. Each algorithm category has code files for specific algorithms.

## Getting Started

To use this repository:

**Clone the Repository**:

```bash
    git clone https://github.com/AlexzGut/Data_Structures_and_Algorithms.git
    cd Data_Structures_and_Algorithms
```

## Building and Running with Maven

1. **Build the Project**:
    ```bash
    mvn clean compile
    ```

2. **Run Tests**:
    ```bash
    mvn test
    ```

3. **Run Specific Class**:
   Replace `MainClass` with the actual main class name.
    ```bash
    mvn exec:java -Dexec.mainClass="com.yourname.dsa.MainClass"
    ```

## Dependencies

This project uses the following dependencies:
- **JUnit 5**: For testing (included in the `pom.xml`).


## Progress and Goals 🚀

- Implement foundational data structures and algorithms.
- Optimize and understand time and space complexities.
- Prepare for coding interviews by practicing common problems.

## Resources

These implementations and exercises are inspired by:

- **Books**: ["Data Structures and Algorithms in Java" by Robert Lafore.](https://github.com/abhishek63/Fav-Book/blob/master/Data%20Structures%20%26%20Algorithms%20in%20Java%20-%20Robert%20Lafore.pdf)
- **Online Platforms**: [LeetCode](https://leetcode.com/).
- **Courses**: [LinkedIn Learning](https://www.linkedin.com/learning/).

## Contributing

I’m continuously improving and expanding this repository. If you find any issues or have suggestions, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---

Thank you for visiting my Data Structures and Algorithms repository! Let's keep coding and growing. 💻
