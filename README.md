# Amazon Selenium Automation Framework with Docker Grid

This project is a complete automation framework designed for testing the Amazon website using **Selenium WebDriver**, **TestNG**, **ExtentReports**, and **Docker Grid**. The framework follows a modular, maintainable, and scalable architecture using **Java + Maven**.

---

## 📁 Project Structure

<pre> Amazon_Selenium_Project/ ├── .idea/ │ ├── inspectionProfiles/ │ │ └── Project_Default.xml │ ├── libraries/ │ │ └── chromedriver_win64.xml │ ├── .gitignore │ ├── compiler.xml │ ├── encodings.xml │ ├── gradle.xml │ ├── jarRepositories.xml │ ├── misc.xml │ ├── uiDesigner.xml │ ├── vcs.xml │ └── workspace.xml │ ├── extent-test-output/ │ └── index.html │ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ └── Amazon/ │ │ │ ├── annotations/ │ │ │ │ ├── AnnotationsTest.java │ │ │ │ └── FrameworkAnnotation.java │ │ │ │ │ │ │ ├── com.trywithresources/ │ │ │ │ └── Runner.java │ │ │ │ │ │ │ ├── config/ │ │ │ │ ├── config.properties │ │ │ │ └── EnumRunner.java │ │ │ │ │ │ │ ├── constants/ │ │ │ │ └── FrameworkConstants.java │ │ │ │ │ │ │ ├── dataprovider.latest/ │ │ │ │ ├── DataProviderDependencyInj.java │ │ │ │ ├── DataProviderExcel.java │ │ │ │ ├── DataProviderTest.java │ │ │ │ └── Employee.java │ │ │ │ │ │ │ ├── dockerexecution/ │ │ │ │ └── ExecuteTestsInDocker.java │ │ │ │ │ │ │ ├── driver/ │ │ │ │ ├── Driver.java │ │ │ │ ├── DriverManager.java │ │ │ │ └── package-info.java │ │ │ │ │ │ │ ├── encodeaecode/ │ │ │ │ └── Runner.java │ │ │ │ │ │ │ ├── enums/ │ │ │ │ ├── CategoryType.java │ │ │ │ ├── ConfigProperties.java │ │ │ │ ├── Severity.java │ │ │ │ ├── SeverityClass.java │ │ │ │ └── WaitStrategy.java │ │ │ │ │ │ │ ├── exceptions/ │ │ │ │ ├── BrowserInvocationFailedException.java │ │ │ │ ├── ExceptionDemo.java │ │ │ │ ├── ExceptionDemoTest.java │ │ │ │ ├── FrameworkException.java │ │ │ │ ├── InvalidPathForExcelException.java │ │ │ │ ├── InvalidPathForFilesException.java │ │ │ │ ├── InvalidPathForPropertyFileException.java │ │ │ │ └── PropertyFileUsageException.java │ │ │ │ │ │ │ ├── factory/ │ │ │ │ ├── DriverFactory.java │ │ │ │ └── ExplicitWaitFactory.java │ │ │ │ │ │ │ ├── listeners/ │ │ │ │ ├── AnnotationTransformer.java │ │ │ │ ├── AnnotationTransformers.java │ │ │ │ ├── ListenerClass.java │ │ │ │ ├── MethodInterceptor.java │ │ │ │ ├── Retry.java │ │ │ │ └── RetryFailedTests.java │ │ │ │ │ │ │ ├── pages/ │ │ │ │ ├── AmazonHamburgerMenuPage.java │ │ │ │ ├── AmazonHomePage.java │ │ │ │ ├── AmazonLaptopPage.java │ │ │ │ ├── AmazonPrinterAndInkPage.java │ │ │ │ └── BasePage.java │ │ │ │ │ │ │ ├── reports/ │ │ │ │ ├── ExtentLogger.java │ │ │ │ ├── ExtentManager.java │ │ │ │ └── ExtentReport.java │ │ │ │ │ │ │ ├── utils/ │ │ │ │ ├── DataProviderUtils.java │ │ │ │ ├── DynamicXpathUtils.java │ │ │ │ ├── ExcelUtils.java │ │ │ │ ├── PropertyUtils.java │ │ │ │ └── ScreenshotUtils.java │ │ │ │ │ │ │ └── webdrivermanager/ │ │ │ ├── allclasses-index.html │ │ │ ├── allpackages-index.html │ │ │ └── element-list │ │ │ │ │ └── resources/ │ │ ├── glass.png │ │ ├── x.png │ │ └── script-dir/ │ │ ├── jquery-3.6.1.min.js │ │ ├── jquery-ui.min.css │ │ └── jquery-ui.min.js │ │ └── test/ │ ├── java/ │ │ └── tests/ │ │ ├── AmazonTest.java │ │ └── BaseTest.java │ │ │ └── test_output/ │ └── docker-compose.yml │ ├── executable/ │ ├── chromedriver-win64/ │ ├── geckodriver-v0.34.0-win64/ │ ├── chromedriver-win64.zip │ └── geckodriver-v0.34.0-win64.zip │ ├── index-files/ │ └── index-1.html │ ├── legal/ │ ├── COPYRIGHT │ ├── LICENSE │ ├── jquery.md │ └── jqueryUI.md │ ├── target/ │ ├── index.html │ └── kibana.json.txt │ ├── .gitignore ├── pom.xml ├── testing.xml ```


---

## 🚀 Features

- ✅ Selenium WebDriver with Chrome/Firefox support  
- ✅ Page Object Model (POM) design pattern  
- ✅ TestNG for test orchestration  
- ✅ ExtentReports for advanced HTML reporting  
- ✅ Docker Grid support for parallel cross-browser execution  
- ✅ Data-driven testing using Excel  
- ✅ Custom retry mechanism and annotations  
- ✅ Configurable via `config.properties` file  

---

## 🛠️ Tools & Technologies

| Tool            | Purpose                      |
|-----------------|------------------------------|
| Java            | Programming language         |
| Selenium        | UI Automation                |
| TestNG          | Test management              |
| Maven           | Dependency & build tool      |
| ExtentReports   | Test reporting               |
| Docker          | Containerized grid execution |
| Git/GitHub      | Version control              |

---

## ⚙️ How to Run Tests

1. **Clone the repository**
   ```bash
   gh repo clone asoaib121/Amazon_Project_Selenium_Testing

2. **Import into IntelliJ IDEA or Eclipse as a Maven Project**

3. **Configure the drivers**
  --> Add ChromeDriver and GeckoDriver path inside executable/ or set system properties if needed.
   
4. **Run with Maven**
  --> mvn clean test

5. **Select rigth path**
  --> go to your path (("user.dir"),"Amazon","src","Amazon")
   note: run docker-compose.yml file

🐳 **Run Tests on Docker Grid**
6. **Navigate to test_output and start the docker grid**
  -->  docker-compose up -d

 7. **Search  Web Browser**
  --> Go to your Web Browser and search (localhost:4445)

 8. **Run Your Project(TestNG suite)**
  --> Go to Your IDE
  -->Right-click on testing.xml → Run

9. **View Test Report**
  -->Go to: extent-test-output/index.html

10. **Stop the Containers**
  --> Go to Docker dektop terminal.
  --> docker-compose down


📌 Configurations
Edit the following file for environment settings:
src/main/java/Amazon/config/config.properties


📸 Screenshots & Reports
Screenshots on failure are auto-saved using ScreenshotUtils.



🙋 Author
Shoaib Ahmed
BSc in CSE, Green University of Bangladesh
💼 Focus: QA Automation Engineer



📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

**MIT License**

Copyright (c) 2025 Shoaib

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell      
copies of the Software, and to permit persons to whom the Software is         
furnished to do so, subject to the following conditions:                       

The above copyright notice and this permission notice shall be included in    
all copies or substantial portions of the Software.                            

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR    
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,      
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE    
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER        
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING       
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS  
IN THE SOFTWARE.
