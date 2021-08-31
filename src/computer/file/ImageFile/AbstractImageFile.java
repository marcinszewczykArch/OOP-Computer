package computer.file.ImageFile;

import computer.file.AbstractFile;
import computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
    super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
