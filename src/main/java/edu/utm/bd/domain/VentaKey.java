package edu.utm.bd.domain;

public class VentaKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column venta.IdVenta
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private String idventa;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column venta.Cliente_Id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private Integer clienteId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column venta.Usuario_id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	private Integer usuarioId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column venta.IdVenta
	 * @return  the value of venta.IdVenta
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public String getIdventa() {
		return idventa;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column venta.IdVenta
	 * @param idventa  the value for venta.IdVenta
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column venta.Cliente_Id
	 * @return  the value of venta.Cliente_Id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public Integer getClienteId() {
		return clienteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column venta.Cliente_Id
	 * @param clienteId  the value for venta.Cliente_Id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column venta.Usuario_id
	 * @return  the value of venta.Usuario_id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public Integer getUsuarioId() {
		return usuarioId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column venta.Usuario_id
	 * @param usuarioId  the value for venta.Usuario_id
	 * @mbg.generated  Wed Apr 25 18:55:18 CDT 2018
	 */
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
}