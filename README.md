# CampusLife - AssignmentOne

Android application built for **COMPX202/Y05853 Assignment One** at the
University of Waikato. CampusLife is a student companion app that presents
four key student service areas - **Facilities**, **Events**, **Clubs** and
**Support** - in a clean, readable and fully responsive UI.

## Project details

| Setting | Value |
|---|---|
| Language | Java |
| Template | Empty Views Activity |
| Minimum API level | API 24 (Android 7.0 Nougat) |
| Target API level | API 34 |
| Build system | Gradle (wrapper included) |

## What the app does

- **Main screen** - a campus photo banner with the welcome message
  "Welcome to CampusLife - Your Pocket Guide to University of Waikato"
  and four ImageButtons arranged in a 2 x 2 grid.
- **Orientation support** - in portrait the buttons are shown as a 2 x 2
  grid, while in landscape they are displayed next to each other in a
  single row (`res/layout-land`).
- **Button states** - a drawable selector keeps the buttons green
  (`#1B5E20`) while not pressed and light green (`#66BB6A`) while pressed.
- **Detail screen** - tapping a button starts the `DetailActivity` through
  an explicit Intent that carries a unique topic identifier. The activity
  uses the identifier to look up the title, content and image of the
  selected topic in the `arrays.xml` dummy data (no if statements or switch
  cases are used).
- **Launcher icon** - generated from the CampusLife logo image.

## Repository layout

```
app/src/main/java/com/example/assignmentone/
    MainActivity.java      - main screen, click handling and Intents
    DetailActivity.java    - detail screen, populated from arrays.xml
app/src/main/res/
    layout/                - portrait layouts
    layout-land/           - landscape layout
    drawable/              - images and the button selector
    values/                - strings, colours, dimens and arrays.xml
```

Each assignment part (A - I) has its own commit in the Git history.

## How to run

1. Clone the repository.
2. Open the project in Android Studio and let Gradle sync.
3. Run the `app` configuration on an emulator or a device with
   Android 7.0 (API 24) or newer.

## Author

Student ID: 20243006996
