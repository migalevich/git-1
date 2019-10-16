package homework3;

import java.util.Objects;

abstract class FloatingCraft {
    private String typeFloatingCraft;

    FloatingCraft() {
    }

    public FloatingCraft(String typeFloatingCraft) {
        this.typeFloatingCraft = typeFloatingCraft;
    }

    public String getTypeFloatingCraft() {
        return typeFloatingCraft;
    }

    public void setTypeFloatingCraft(String typeFloatingCraft) {
        this.typeFloatingCraft = typeFloatingCraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FloatingCraft that = (FloatingCraft) o;
        return Objects.equals(typeFloatingCraft, that.typeFloatingCraft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeFloatingCraft);
    }

    @Override
    public String toString() {
        return "FloatingCraft{" +
                "typeFloatingCraft='" + typeFloatingCraft + '\'' +
                '}';
    }

    public abstract void getSound();

}
