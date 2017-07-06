package com.bbva.mzic.sendmoneymovements.facade.v01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.bbva.mzic.sendmoneymovements.facade.v01.dto.DtoPaymentByFlapResponse;
import com.bbva.mzic.sendmoneymovements.facade.v01.impl.CreateTransactionByFlapImpl;
import com.bbva.mzic.sendmoneymovements.facade.v01.impl.SendMoneyMovementsImpl;
import com.bbva.mzic.utils.NotResponse;

@RunWith(MockitoJUnitRunner.class)
public class SendmoneymovementsTest {

	private static String URL = "http://localhost:8080/";
	
	private SendMoneyMovementsImpl sendMoneyMovementsImpl;
	private CreateTransactionByFlapImpl createTransactionByFlapImpl;
	
	@Before
	public void init(){
		sendMoneyMovementsImpl = new SendMoneyMovementsImpl();
		createTransactionByFlapImpl = new CreateTransactionByFlapImpl();
	}
	
	@Test
	@Ignore
	public void sendTransactionFlapTest(){
		NotResponse res = sendMoneyMovementsImpl.petitionPost(URL, 
												"zic/sendMoneyMovements/V03/sendTransactionFlap");
		
		Assert.assertEquals(null, res);
	}
	
	@Test
	public void CreateTransactionByFlapTest(){
//		http://localhost:8080/zic/sendMoneyMovements/V03/createTransactionByFlap?_wadl
		DtoPaymentByFlapResponse res = createTransactionByFlapImpl.petitionPost(DtoPaymentByFlapResponse.class ,URL, 
												"zic/sendMoneyMovements/V03/createTransactionByFlap");
			
		Assert.assertNotNull(res);
		Assert.assertEquals("27272727", res.getMovementId());
	}
	
}
