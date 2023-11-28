import java.util.Scanner;

class CPU {
    private String brand;
    private int cores;

    public CPU(String brand) {
        this.brand = brand;
        this.cores = cores;
    }

    public String getBrand() {
        return brand;
    }
}

class RAM {
    private String brand;

    public RAM(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class GPU {
    private String brand;

    public GPU(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
class MB {
    private String brand;

    public MB(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
class PU {
    private String brand;

    public PU(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class OH {
    private String brand;

    public OH(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class CO {
    private String brand;

    public CO(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class HD {
    private String brand;

    public HD(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class SS {
    private String brand;

    public SS(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class SystemBlock {
    private MB mb;
    private CPU cpu;
    private RAM ram;
    private GPU gpu;
    private PU pu;
    private OH oh;

    public SystemBlock(CPU cpu, RAM ram, GPU gpu, MB mb, PU pu, OH oh) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.mb = mb;
        this.pu = pu;
        this.oh = oh;
    }

    public boolean isCompatible() {
        if (cpu.getBrand().equalsIgnoreCase("1") && gpu.getBrand().equalsIgnoreCase("1") && mb.getBrand().equalsIgnoreCase("1") && oh.getBrand().equalsIgnoreCase("1"))
        {
            return true;
        }
        else if (cpu.getBrand().equalsIgnoreCase("2") && gpu.getBrand().equalsIgnoreCase("2") && mb.getBrand().equalsIgnoreCase("2") && pu.getBrand().equalsIgnoreCase("2")&& oh.getBrand().equalsIgnoreCase("2"))
        {
            return true;
        } else
        {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку процессора ( 1 - Core I3-10100F OEM или 2 - AMD Ryzen 5 3600):");
        String brand = scanner.nextLine();
        CPU cpu = new CPU(brand);

        System.out.println("Введите марку оперативной памяти (1 - Kingston Fury Beast Black 16 гб или 2 - NETAC Basic 32 гб):");
        String ramBrand = scanner.next();
        RAM ram = new RAM(ramBrand);

        System.out.println("Введите марку видеокарты (1 - GeForce GTX 1060 или 2 - Radeon RX 580):");
        String gpuBrand = scanner.next();
        GPU gpu = new GPU(gpuBrand);

        System.out.println("Введите марку материнской платы (1 - MSI B560M PRO-E или 2 - Asrock B550M PG RIPTIDE Soc-AM4):");
        String mbBrand = scanner.next();
        MB mb = new MB(mbBrand);

        System.out.println("Введите марку блока питания (1 - Aerocool VX PLUS 500W или 2 - Aerocool VX PLUS 750W):");
        String puBrand = scanner.next();
        PU pu = new PU(puBrand);

        System.out.println("Введите марку кулера охлаждения (1 - ID-COOLING SE-214-XT ARGB WHITE или 2 - ID-COOLING SE-214-XT):");
        String ohBrand = scanner.next();
        OH oh = new OH(ohBrand);

        System.out.println("Введите марку корпуса (1 - ATX GMNG GG-CC100 или 2 - mATX Aerocool Cylon Mini):");
        String coBrand = scanner.next();
        CO CO = new CO(coBrand);

        System.out.println("Введите марку жесткого диска (1 - Seagate Barracuda ST2000DM008, 2ТБ или 2 - WD Caviar Blue WD10EZEX, 1ТБ):");
        String hdBrand = scanner.next();
        HD hd = new HD(hdBrand);

        System.out.println("Введите марку ssd (1 - Samsung 970 EVO Plus или 2 - Samsung 980 PRO MZ-V8P1T0BW 1ТБ):");
        String ssBrand = scanner.next();
        SS ss = new SS(ssBrand);

        SystemBlock myComputer = new SystemBlock(cpu, ram, gpu, mb, pu,oh);
        if (myComputer.isCompatible()) {
            System.out.println("Компьютер совместим!");
        } else {
            System.out.println("Компьютер несовместим!");
        }

        scanner.close();
    }
}