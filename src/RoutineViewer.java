import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RoutineViewer extends Application {

    // Before the app launches, to loads assets.
    @Override
    public void init() throws Exception {

    }


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("J.R.R.'s Routine Viewer");
        stage.initStyle(StageStyle.DECORATED);
        stage.setX(400);
        stage.setY(400);
        stage.setWidth(400);
        stage.setHeight(400);
        BackgroundFill background_fill = new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        VBox root = new VBox();
        root.setBackground(background);

        Scene scene = new Scene(root);
        stage.setScene(scene);

        // Make the scenes & stages for the other four windows.
        Stage makeScheduleStage = new Stage();
        makeScheduleStage.setTitle("Make Schedule");
        stage.initStyle(StageStyle.DECORATED);
        makeScheduleStage.setHeight(400);
        makeScheduleStage.setWidth(300);
        makeScheduleStage.setX(900);
        makeScheduleStage.setY(400);
        VBox rootMakeSchedule = new VBox();
        rootMakeSchedule.setBackground(background);
        Scene makeScheduleScene = new Scene(rootMakeSchedule);
        makeScheduleStage.setScene(makeScheduleScene);

        Stage viewGoalsStage = new Stage();
        viewGoalsStage.setTitle("View Goals");
        viewGoalsStage.setHeight(400);
        viewGoalsStage.setWidth(300);
        viewGoalsStage.setX(500);
        viewGoalsStage.setY(400);
        VBox rootViewGoals = new VBox();
        rootViewGoals.setBackground(background);
        Scene viewGoalsScene = new Scene(rootViewGoals);
        viewGoalsStage.setScene(viewGoalsScene);

        Stage dietPlannerStage = new Stage();
        dietPlannerStage.setTitle("Diet Planner");
        dietPlannerStage.setHeight(400);
        dietPlannerStage.setWidth(300);
        dietPlannerStage.setX(500);
        dietPlannerStage.setY(400);
        VBox rootDietPlanner = new VBox();
        rootDietPlanner.setBackground(background);
        Scene dietPlannerScene = new Scene(rootDietPlanner);
        dietPlannerStage.setScene(dietPlannerScene);

        Stage clothingGeneratorStage = new Stage();
        clothingGeneratorStage.setTitle("Clothing Generator");
        clothingGeneratorStage.setHeight(400);
        clothingGeneratorStage.setWidth(300);
        clothingGeneratorStage.setX(500);
        clothingGeneratorStage.setY(400);
        VBox rootClothingGenerator = new VBox();
        rootClothingGenerator.setBackground(background);
        Scene clothingGeneratorScene = new Scene(rootClothingGenerator);
        clothingGeneratorStage.setScene(clothingGeneratorScene);

        // Add the buttons to the main scene.
        Button makeSchedule = new Button();
        makeSchedule.setText("Make _Schedule");
        makeSchedule.setStyle("-fx-font-size: 30");
        makeSchedule.setMnemonicParsing(true);
        makeSchedule.setOnAction(e -> {
            makeScheduleStage.show();
        });

        Button viewGoals = new Button();
        viewGoals.setText("View _Goals");
        viewGoals.setStyle("-fx-font-size: 30");
        viewGoals.setMnemonicParsing(true);
        viewGoals.setOnAction(e -> {
            viewGoalsStage.show();
        });

        Button dietPlanner = new Button();
        dietPlanner.setText("_Diet Planner");
        dietPlanner.setStyle("-fx-font-size: 30");
        dietPlanner.setMnemonicParsing(true);
        dietPlanner.setOnAction(e -> {
            dietPlannerStage.show();
        });

        Button clothingGenerator = new Button();
        clothingGenerator.setText("_Clothing Generator");
        clothingGenerator.setStyle("-fx-font-size: 30");
        clothingGenerator.setMnemonicParsing(true);
        clothingGenerator.setOnAction(e -> {
            clothingGeneratorStage.show();
        });

        root.getChildren().addAll(makeSchedule, viewGoals, dietPlanner, clothingGenerator);



        stage.show();
    }

    // Will run after it stops.
    @Override
    public void stop() throws Exception {

    }
}
