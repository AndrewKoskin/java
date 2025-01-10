package Module8.Builder.Lesson;

public class Programmer {
    String firstName;
    String lastName;
    SkillGrade hardSkills;
    SkillGrade softSkills;

    Programmer(ProgrammerBuilder programmerBuilder) {
        this.firstName = programmerBuilder.firstName;
        this.lastName = programmerBuilder.lastName;
        this.hardSkills = programmerBuilder.hardSkills;
        this.softSkills = programmerBuilder.softSkills;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hardSkills=" + hardSkills +
                ", softSkills=" + softSkills +
                '}';
    }

    public static void main(String[] args) {
        ProgrammerBuilder programmerBuilder = new ProgrammerBuilder("Bad hard skills", "Good soft skills");
        Director director = new Director(programmerBuilder);
        System.out.println(director.getExtraVertProgrammer());
        ProgrammerBuilder programmerBuilder1 = new ProgrammerBuilder("Good hard skills", "Bad soft skills");
        Director director1 = new Director(programmerBuilder1);
        System.out.println(director1.getIntrovertProgrammer());
    }

}

class ProgrammerBuilder {
    String firstName;
    String lastName;
    SkillGrade hardSkills;
    SkillGrade softSkills;

    public ProgrammerBuilder(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("firstName or lastName is null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ProgrammerBuilder withHardSkills(SkillGrade hardSkills) {
        this.hardSkills = hardSkills;
        return this;
    }

    public ProgrammerBuilder withSoftSkills(SkillGrade softSkills) {
        this.softSkills = softSkills;
        return this;
    }

    public Programmer build() {
        return new Programmer(this);
    }

}

enum SkillGrade {
    GOOD, BAD;
}

class Director {
    private final ProgrammerBuilder programmerBuilder;

    public Director(ProgrammerBuilder programmerBuilder) {
        this.programmerBuilder = programmerBuilder;
    }

    public Programmer getIntrovertProgrammer() {
        return programmerBuilder
                .withHardSkills(SkillGrade.GOOD)
                .withSoftSkills(SkillGrade.BAD)
                .build();
    }

    public Programmer getExtraVertProgrammer() {
        return programmerBuilder
                .withHardSkills(SkillGrade.BAD)
                .withSoftSkills(SkillGrade.GOOD)
                .build();
    }
}