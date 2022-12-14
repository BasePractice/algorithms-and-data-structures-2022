package ru.mirea.practice.task3to4;

import java.util.regex.Pattern;

public class Divide<T> {
    private String div;

    Divide(T a, T b) {
        div = a.toString() + " / " + b.toString();
    }

    public String getDiv() {
        return div;
    }

    public double evaluate(int number) {
        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("-");
        Pattern p3 = Pattern.compile("\\+");
        Pattern p4 = Pattern.compile("/");
        Pattern p5 = Pattern.compile("\\*");

        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split(div);
        int buff = 0;
        for (int i = 0; i < words.length; i += 2) {
            if (!p1.matcher(words[i]).matches() & !p2.matcher(words[i]).matches()
                    & !p3.matcher(words[i]).matches() & !p4.matcher(words[i]).matches()
                    & !p5.matcher(words[i]).matches()) {
                buff = i;
                break;
            }
        }

        double answer = 0;
        switch (buff) {
            case 0:
                if (p2.matcher(words[3]).matches()) {
                    answer = number + Integer.parseInt(words[4]);
                    if (p2.matcher(words[1]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                } else if (p3.matcher(words[3]).matches()) {
                    answer = number - Integer.parseInt(words[4]);
                    if (p2.matcher(words[1]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                } else if (p4.matcher(words[3]).matches()) {
                    answer = number * Integer.parseInt(words[4]);
                    if (p2.matcher(words[1]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                } else if (p5.matcher(words[3]).matches()) {
                    answer = number / Integer.parseInt(words[4]);
                    if (p2.matcher(words[1]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                }
                break;
            case 2:
                if (p2.matcher(words[3]).matches()) {
                    answer = number + Integer.parseInt(words[4]);
                    if (p2.matcher(words[1]).matches()) {
                        answer = answer + Integer.parseInt(words[0]);
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = answer - Integer.parseInt(words[0]);
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = answer * Integer.parseInt(words[0]);
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = answer / Integer.parseInt(words[0]);
                    }
                } else if (p3.matcher(words[3]).matches()) {
                    answer = number - Integer.parseInt(words[4]);
                    if (p2.matcher(words[1]).matches()) {
                        answer = answer + Integer.parseInt(words[0]);
                    } else if (p3.matcher(words[1]).matches()) {
                        answer = answer - Integer.parseInt(words[0]);
                    } else if (p4.matcher(words[1]).matches()) {
                        answer = answer * Integer.parseInt(words[0]);
                    } else if (p5.matcher(words[1]).matches()) {
                        answer = answer / Integer.parseInt(words[0]);
                    }
                } else if (p4.matcher(words[3]).matches()) {
                    answer = number * Integer.parseInt(words[0]);
                    if (p2.matcher(words[3]).matches()) {
                        answer = answer + Integer.parseInt(words[4]);
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = answer - Integer.parseInt(words[4]);
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = answer * Integer.parseInt(words[4]);
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = answer / Integer.parseInt(words[4]);
                    }
                } else if (p5.matcher(words[3]).matches()) {
                    answer = number / Integer.parseInt(words[0]);
                    if (p2.matcher(words[3]).matches()) {
                        answer = answer + Integer.parseInt(words[4]);
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = answer - Integer.parseInt(words[4]);
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = answer * Integer.parseInt(words[4]);
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = answer / Integer.parseInt(words[4]);
                    }
                }
                break;
            case 4:
                if (p2.matcher(words[1]).matches()) {
                    answer = number + Integer.parseInt(words[0]);
                } else if (p3.matcher(words[1]).matches()) {
                    if (p2.matcher(words[3]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                } else if (p3.matcher(words[1]).matches()) {
                    answer = number - Integer.parseInt(words[0]);
                    if (p2.matcher(words[3]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                } else if (p4.matcher(words[1]).matches()) {
                    answer = number * Integer.parseInt(words[0]);
                    if (p2.matcher(words[3]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                } else if (p5.matcher(words[1]).matches()) {
                    answer = number / Integer.parseInt(words[0]);
                    if (p2.matcher(words[3]).matches()) {
                        answer = answer + Integer.parseInt(words[2]);
                    } else if (p3.matcher(words[3]).matches()) {
                        answer = answer - Integer.parseInt(words[2]);
                    } else if (p4.matcher(words[3]).matches()) {
                        answer = answer * Integer.parseInt(words[2]);
                    } else if (p5.matcher(words[3]).matches()) {
                        answer = answer / Integer.parseInt(words[2]);
                    }
                }
                break;
            default:
                break;
        }
        System.out.println(answer);
        return answer;
    }

    @Override
    public String toString() {
        return div;
    }
}
