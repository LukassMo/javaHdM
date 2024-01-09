package exercisesRECAP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import QGraphic.DispQg;

public class T1002_TempArray {
	public static void main(String args[]) throws IOException {
		final String fileValues = "Temperatures2500.csv";
		int rows = rowsInFile(fileValues);
		System.out.println("Number of lines in file: " + rows);
		long[] times = new long[rows];
		double[] temps = new double[rows];
		readFile(fileValues, times, temps);
		for (int i = 0; i < rows; ++i) {
			System.out.println(DispQg.strTime(times[i]) + " : " + temps[i]);
		}
		//G,H,I
		int mini = minValueIndex(temps);
		System.out.println("Minimum value " + temps[mini] + "at "+ DispQg.strTime(times[mini]));
		int maxi = maxValueIndex(temps);
		System.out.println("Maximum value " + temps[maxi] + "at "+ DispQg.strTime(times[maxi]));
		System.out.println("Average Temperature: " + avgValue(temps));
		DispQg dq= new DispQg("Temperatures of a day");
		dq.setKoord(times,temps);

	}

	public static int rowsInFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		int z = 0;
		int k;
		while (br.readLine() != null) {
			z++;
		}
		return z;
	}

	public static void readFile(String filename, long[] tm, double[] vl) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int index = 0;
		while ((s = br.readLine()) != null) {
			String[] parts = s.split(";");
			tm[index] = Long.parseLong(parts[0]);
			vl[index] = Double.parseDouble(parts[1]);
			index++;
		}
	
	
	}
	public static int maxValueIndex(double[] v) {
		int idx = 0;
		double max= v[0];
		for(int i=1;i<v.length;++i) {
			if(max<v[i]) {
				max =v[i];
				idx= i;
			}
		}
		return idx;
	}
	public static int minValueIndex(double[] v) {
		int idx = 0;
		double min= v[0];
		for(int i=1;i<v.length;++i) {
			if(min>v[i]) {
				min =v[i];
				idx= i;
			}
		}
		return idx;
	}
	public static double avgValue(double[] v) {
		double avg = 0;
		for(int i=1; i<v.length;++i) {
			avg+=v[i];
		}
		return avg/v.length;
	}
}
