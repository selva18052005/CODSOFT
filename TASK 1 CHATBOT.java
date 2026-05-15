import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class SmartCampusBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("========================================");
        System.out.println("      CAMPUS AI CHAT ASSISTANT");
        System.out.println("========================================");
        System.out.println("Bot : Welcome Student!");
        System.out.println("Bot : Ask me anything.");
        System.out.println("Bot : Type 'exit' to close the chatbot.");
        System.out.println();

        while (true) {

            System.out.print("You : ");
            String msg = sc.nextLine().toLowerCase();

            // Exit
            if (msg.equals("exit")) {

                System.out.println("Bot : Session ended successfully.");
                break;
            }

            // Greeting
            else if (msg.contains("hello") || msg.contains("hi")) {

                String[] replies = {
                        "Hello! Ready for learning today?",
                        "Hi there! What would you like to discuss?",
                        "Hey! Need help with coding or studies?"
                };

                System.out.println("Bot : " + replies[random.nextInt(replies.length)]);
            }

            // Mood Detection
            else if (msg.contains("tired") || msg.contains("stress")) {

                System.out.println("Bot : Take a short break and refresh your mind.");
                System.out.println("Bot : Productivity improves with proper rest.");
            }

            // Attendance
            else if (msg.contains("attendance")) {

                System.out.println("Bot : Maintain above 75% attendance to avoid exam issues.");
            }

            // Placement
            else if (msg.contains("placement")) {

                System.out.println("Bot : Focus on DSA, aptitude, communication, and projects.");
            }

            // Resume
            else if (msg.contains("resume")) {

                System.out.println("Bot : A good resume should contain skills, projects, and achievements.");
            }

            // Coding
            else if (msg.contains("coding")) {

                System.out.println("Bot : Practice one problem daily to improve logic building.");
            }

            // AI
            else if (msg.contains("ai")) {

                System.out.println("Bot : Artificial Intelligence allows machines to think and learn.");
            }

            // Cybersecurity
            else if (msg.contains("cyber")) {

                System.out.println("Bot : Cybersecurity protects systems from hackers and attacks.");
            }

            // Cloud
            else if (msg.contains("cloud")) {

                System.out.println("Bot : Cloud computing provides servers and storage through the internet.");
            }

            // Time
            else if (msg.contains("time")) {

                LocalTime t = LocalTime.now();

                System.out.println("Bot : Current Time -> "
                        + t.getHour() + ":"
                        + t.getMinute() + ":"
                        + t.getSecond());
            }

            // Date
            else if (msg.contains("date")) {

                LocalDate d = LocalDate.now();

                System.out.println("Bot : Today's Date -> " + d);
            }

            // Motivation
            else if (msg.contains("motivate")) {

                String[] motivation = {
                        "Success starts with discipline.",
                        "Small progress every day leads to big results.",
                        "Consistency beats talent when talent is inconsistent."
                };

                System.out.println("Bot : "
                        + motivation[random.nextInt(motivation.length)]);
            }

            // Java
            else if (msg.contains("java")) {

                System.out.println("Bot : Java is platform independent because of JVM.");
            }

            // Python
            else if (msg.contains("python")) {

                System.out.println("Bot : Python is popular for AI, automation, and data science.");
            }

            // Exam
            else if (msg.contains("exam")) {

                System.out.println("Bot : Prepare smartly using revision and problem solving.");
            }

            // Food
            else if (msg.contains("food")) {

                System.out.println("Bot : Healthy food improves concentration and energy.");
            }

            // Joke
            else if (msg.contains("joke")) {

                String[] jokes = {
                        "Why do Java developers wear glasses? Because they cannot C#.",
                        "Why was the computer cold? It forgot to close its Windows.",
                        "A programmer's wife told him to get groceries and he never returned."
                };

                System.out.println("Bot : "
                        + jokes[random.nextInt(jokes.length)]);
            }

            // Password Strength
            else if (msg.contains("password")) {

                System.out.println("Bot : Use uppercase, lowercase, numbers, and symbols for strong passwords.");
            }

            // Internet
            else if (msg.contains("internet")) {

                System.out.println("Bot : The internet connects millions of devices globally.");
            }

            // Calculator Addition
            else if (msg.matches(".*\\d+\\s*\\+\\s*\\d+.*")) {

                try {

                    String expression = msg.replaceAll(" ", "");
                    String[] nums = expression.split("\\+");

                    int a = Integer.parseInt(nums[0]);
                    int b = Integer.parseInt(nums[1]);

                    System.out.println("Bot : Result = " + (a + b));

                } catch (Exception e) {

                    System.out.println("Bot : Unable to calculate.");
                }
            }

            // Calculator Multiplication
            else if (msg.matches(".*\\d+\\s*\\*\\s*\\d+.*")) {

                try {

                    String expression = msg.replaceAll(" ", "");
                    String[] nums = expression.split("\\*");

                    int a = Integer.parseInt(nums[0]);
                    int b = Integer.parseInt(nums[1]);

                    System.out.println("Bot : Result = " + (a * b));

                } catch (Exception e) {

                    System.out.println("Bot : Invalid multiplication.");
                }
            }

            // About Bot
            else if (msg.contains("who are you")) {

                System.out.println("Bot : I am SmartCampusBot developed using Java rule-based logic.");
            }

            // Thank You
            else if (msg.contains("thank")) {

                System.out.println("Bot : Happy to help!");
            }

            // Unknown Question
            else {

                String[] unknown = {
                        "Interesting question. I am still learning that.",
                        "I currently don't have information about that topic.",
                        "Please ask a programming or student-related question."
                };

                System.out.println("Bot : "
                        + unknown[random.nextInt(unknown.length)]);
            }
        }

        sc.close();
    }
}
