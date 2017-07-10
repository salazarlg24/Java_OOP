class ProjectTest{
	public static void main(String[] args) {
		Project project1 = new Project();
		project1.setName("Project X");
		project1.setDescription("This is the most epic project");
		String name = project1.getName();
		String desc = project1.getDescription();
		System.out.println(project1.elivatorPitch(name, desc));
	}
}