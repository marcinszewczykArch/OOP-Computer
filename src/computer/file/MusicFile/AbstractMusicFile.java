package computer.file.MusicFile;
import computer.file.AbstractFile;
import computer.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }

    @Override
    public String getName() {
        return "plik nazywa się: " + super.getName();
    }

    @Override
    public String toString() {
        return "{" +
                "bandName='" + bandName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
