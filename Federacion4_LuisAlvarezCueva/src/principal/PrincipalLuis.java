package principal;

import java.util.Scanner;

import entidades.*;

public class PrincipalLuis {

	public static void main(String[] args) {
		boolean valid0 = false;
		Rol rol;
		String usu;
		String pas;
		// TODO Auto-generated method stub
		do {
			System.out.println("Indique su tipo de usuario:");
			System.out.println("1: Directiva de la federacion.");
			System.out.println("2: Manager.");
			System.out.println("3: Atleta.");
			System.out.println("4: Colegiado.");
			System.out.println("5: Administrador.");
			System.out.println("6: Invitado.");
			System.out.println("0: Cerrar el programa.");

			Scanner sc = new Scanner(System.in);

			switch (sc.nextInt()) {
			case 1:
				boolean valid1 = false;
				rol = Rol.DIRECTIVA;
				do {
					System.out.println("Direccion de la Federacion:");
					System.out.println("Usuario:");
					usu = sc.next();
					System.out.println("Contrasenna:");
					pas = sc.next();
					Credenciales crd = new Credenciales(usu, pas);

					if (login(crd)) {
						System.out.println("1: Gestion de medallas.");
						System.out.println("2: Gestion de competiciones y pruebas.");
						System.out.println("0: Retroceder.");

						switch (sc.nextInt()) {
						case 1:
							boolean valid11 = false;
							do {
								System.out.println("Ha escogido Gestion de medallas.");
								System.out.println("1: Nueva medalla.");
								System.out.println("0: Retroceder.");

								switch (sc.nextInt()) {
								case 1:
									boolean valid111 = false;
									do {
										System.out.println("Indique el tipo de medalla que desea crear.");
										System.out.println("1: Oro.");
										System.out.println("2: Plata.");
										System.out.println("3: Bronce.");
										System.out.println("0: Retroceder.");

										switch (sc.nextInt()) {
										case 1:
											Oro.nuevoOro();
											break;
										case 2:
											Plata.nuevoPlata();
											break;
										case 3:
											Bronce.nuevoBronce();
											break;
										case 0:
											valid111 = true;
											break;
										default:
											System.out.println("Ha introducido un valor erroneo");
											break;
										}
									} while (!valid111);
									break;
								case 0:
									System.exit(0);
									break;
								default:
									System.out.print("Ha introducido un valor invalido.");
									break;
								}
							} while (!valid11);

							break;
						case 2:
							System.out.println("Ha escogido Gestion de competiciones y pruebas.");
							System.exit(0);
							break;
						case 0:
							valid1 = true;
							break;
						default:
							System.out.println("Ha introducido un valor invalido.");
							break;
						}
					}
				} while (!valid1);
				break;
			case 2:
				boolean valid2 = false;
				rol = Rol.MANAGER;
				do {
					System.out.println("Manager:");
					System.out.println("Usuario:");
					usu = sc.next();
					System.out.println("Contrasenna:");
					pas = sc.next();
					Credenciales crd = new Credenciales(usu, pas);

					if (login(crd)) {
						System.out.println("1: Conformar equipo.");
						System.out.println("2: Inscripcion de equipo en prueba.");
						System.out.println("0: Retroceder.");

						switch (sc.nextInt()) {
						case 1:
							System.out.println("Ha escogido Conformar equipo.");
							System.exit(0);
							break;
						case 2:
							System.out.println("Ha escogido Inscripcion de equipo en prueba.");
							System.exit(0);
							break;
						case 0:
							valid2 = true;
							break;
						default:
							System.out.println("Ha introducido un valor invalido.");
							break;
						}
					}
				} while (!valid2);
				break;
			case 3:
				boolean valid3 = false;
				rol = Rol.ATLETA;
				do {
					System.out.println("Atleta:");
					System.out.println("Usuario:");
					usu = sc.next();
					System.out.println("Contrasenna:");
					pas = sc.next();
					Credenciales crd = new Credenciales(usu, pas);

					if (login(crd)) {
						System.out.println("1: Federarse (Nuevo Atleta).");
						System.out.println("2: Inscripcion de atleta en prueba.");
						System.out.println("0: Retroceder.");

						switch (sc.nextInt()) {
						case 1:
							System.out.println("Ha escogido Federarse (Nuevo Atleta).");
							System.exit(0);
							break;
						case 2:
							System.out.println("Ha escogido Inscripcion de atleta en prueba.");
							System.exit(0);
							break;
						case 0:
							valid3 = true;
							break;
						default:
							System.out.println("Ha introducido un valor invalido.");
							break;
						}
					}
				} while (!valid3);
				break;
			case 4:
				boolean valid4 = false;
				rol = Rol.COLEGIADO;
				do {
					System.out.println("Colegiado:");
					System.out.println("Usuario:");
					usu = sc.next();
					System.out.println("Contrasenna:");
					pas = sc.next();
					Credenciales crd = new Credenciales(usu, pas);

					if (login(crd)) {
						System.out.println("1: Nuevo colegiado.");
						System.out.println("2: Introducir resultados de prueba.");
						System.out.println("0: Retroceder.");

						switch (sc.nextInt()) {
						case 1:
							System.out.println("Ha escogido Nuevo coleguado.");
							System.exit(0);
							break;
						case 2:
							System.out.println("Ha escogido Introducir resultados de prueba.");
							System.exit(0);
							break;
						case 0:
							valid4 = true;
							break;
						default:
							System.out.println("Ha introducido un valor invalido.");
							break;
						}
					}
				} while (!valid4);
				break;
			case 5:
				boolean valid5 = false;
				rol = Rol.ADMIN;
				do {
					System.out.println("Administrador:");
					System.out.println("Usuario:");
					usu = sc.next();
					System.out.println("Contrasenna:");
					pas = sc.next();
					Credenciales crd = new Credenciales(usu, pas);

					if (login(crd)) {
						System.out.println("1: Gestion de medallas.");
						System.out.println("2: Gestion de competiciones y pruebas.");
						System.out.println("3: Conformar equipo.");
						System.out.println("4: Inscripcion de equipo en prueba.");
						System.out.println("5: Federarse (nuevo Atleta).");
						System.out.println("6: Inscripcion de atleta en prueba.");
						System.out.println("7: Nuevo colegiado.");
						System.out.println("8: Introducir resultados de prueba.");
						System.out.println("0: Retroceder.");

						switch (sc.nextInt()) {
						case 1:
							boolean valid51 = false;
							do {
								System.out.println("Ha escogido Gestion de medallas.");
								System.out.println("1: Nueva medalla.");
								System.out.println("0: Retroceder.");

								switch (sc.nextInt()) {
								case 1:
									boolean valid111 = false;
									do {
										System.out.println("Indique el tipo de medalla que desea crear.");
										System.out.println("1: Oro.");
										System.out.println("2: Plata.");
										System.out.println("3: Bronce.");
										System.out.println("0: Retroceder.");

										switch (sc.nextInt()) {
										case 1:
											Oro.nuevoOro();
											break;
										case 2:
											Plata.nuevoPlata();
											break;
										case 3:
											Bronce.nuevoBronce();
											break;
										case 0:
											valid111 = true;
											break;
										default:
											System.out.println("Ha introducido un valor erroneo");
											break;
										}
									} while (!valid111);
									break;
								case 0:
									System.exit(0);
									break;
								default:
									System.out.print("Ha introducido un valor invalido.");
									break;
								}
							} while (!valid51);
							break;
						case 2:
							System.out.println("Ha escogido Gestion de competiciones y pruebas.");
							System.exit(0);
							break;
						case 3:
							System.out.println("Ha escogido Conformar equipo.");
							System.exit(0);
							break;
						case 4:
							System.out.println("Ha escogido Inscripcion de equipo en prueba.");
							System.exit(0);
							break;
						case 5:
							System.out.println("Ha escogido Federarse (nuevo Atleta).");
							System.exit(0);
							break;
						case 6:
							System.out.println("Ha escogido Inscripcion de atleta en prueba.");
							System.exit(0);
							break;
						case 7:
							System.out.println("Ha escogido Nuevo colegiado.");
							System.exit(0);
							break;
						case 8:
							System.out.println("Ha escogido Introducir resultados de prueba.");
							System.exit(0);
							break;
						case 0:
							valid5 = true;
							break;
						default:
							System.out.println("Ha introducido un valor invalido.");
							break;
						}
					}
				} while (!valid5);
				break;
			case 6:
				boolean valid6 = false;
				rol = Rol.INVITADO;
				do {
					System.out.println("Invitado:");
					System.out.println("Bienvenido, invitado");
					System.out.println("0: Retroceder.");

					switch (sc.nextInt()) {
					case 0:
						valid6 = true;
						break;
					default:
						System.out.println("Ha introducido un valor invalido.");
						break;
					}
				} while (!valid6);
				break;
			case 0:
				valid0 = true;
				break;
			default:
				System.out.println("Ha introducido un valor invalido.");
				break;
			}
		} while (!valid0);
	}

	private static boolean login(Credenciales crd) {
		return true;
	}
}
