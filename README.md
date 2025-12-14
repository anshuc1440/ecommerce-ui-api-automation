# 🛒 E-commerce UI + API Automation Framework

An end-to-end automation framework built to validate **data consistency between UI and API layers** of an e-commerce application.  
This project demonstrates **real-world automation engineering practices** including UI testing, API testing, reporting, and CI/CD integration.

---

## 🚀 Tech Stack

- **Java 21**
- **Selenium WebDriver**
- **TestNG**
- **Rest Assured**
- **Maven**
- **Extent Reports**
- **GitHub Actions (CI/CD)**

---

## 🎯 Key Features

- UI automation using **Selenium + Page Object Model**
- API automation using **Rest Assured**
- **UI vs API price validation**
- Config-driven execution (`config.properties`)
- Detailed **Extent HTML reports**
- Headless browser execution for CI
- TestNG suite-based execution
- Fully automated **GitHub Actions CI pipeline**

---

## 📁 Project Structure

```
ecommerce-ui-api-automation
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.anshu.automation
│   │           ├── api        → API utility classes
│   │           ├── pages     → Page Object classes
│   │           └── utils     → Config & report utilities
│   │
│   └── test
│       └── java
│           └── com.anshu.automation
│               ├── base      → BaseTest (TestNG setup)
│               └── tests
│                   └── ui   → Smoke & validation tests
│
├── src/test/resources
│   └── config.properties
│
├── testng.xml
├── pom.xml
└── README.md
```

---

## ▶️ How to Run Tests Locally

### Option 1: From Eclipse
1. Right-click `SmokeTest.java`
2. Run As → **TestNG Test**

### Option 2: From Command Line
```bash
mvn clean test
## 📊 Test Report

```yaml
report:
  type: Extent HTML Report
  generated_at: target/extent-report.html
  contains:
    - test execution summary
    - step-level logs
    - pass/fail status
    - failure reasons
  how_to_view:
    local:
      - run tests
      - open target/extent-report.html in browser
    ci:
      - go to GitHub Actions
      - open latest workflow run
      - download "extent-report" artifact
```
## 🔁 CI/CD Pipeline

```yaml
ci:
  platform: GitHub Actions
  trigger:
    - push to main branch
    - pull request to main
  environment:
    os: ubuntu-latest
    java: 21
    browser: chrome (headless)
  execution:
    - checkout code
    - setup java
    - run mvn clean test
    - generate extent report
    - upload report as artifact
```
## ⚠️ Known Limitations

```yaml
limitations:
  external_api:
    issue: API may return 403 Forbidden in CI
    reason: public APIs block cloud IPs
    handling:
      - failure is logged
      - reported clearly in Extent report
  ui_api_data:
    note: UI and API may not always share same backend
    impact: price mismatch failures are expected
```
## 🧠 What This Project Demonstrates

```yaml
skills:
  automation:
    - selenium ui automation
    - api testing with rest assured
  framework_design:
    - page object model
    - base test architecture
    - config driven execution
  ci_cd:
    - github actions integration
    - headless browser execution
    - artifact based reporting
  quality_engineering:
    - real defect detection
    - environment aware testing
    - clear failure reporting
```
## 👤 Author

```yaml
author:
  name: Anshu Chauhan
  role: Software Quality Engineer
  focus:
    - automation testing
    - sdet practices
    - ci/cd pipelines
```

