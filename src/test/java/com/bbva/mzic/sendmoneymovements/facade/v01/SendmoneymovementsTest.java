package com.bbva.mzic.sendmoneymovements.facade.v01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.bbva.mzic.sendmoneymovements.facade.v01.impl.SendMoneyMovementsImpl;
import com.bbva.mzic.utils.NotResponse;

@RunWith(MockitoJUnitRunner.class)
public class SendmoneymovementsTest {

	private SendMoneyMovementsImpl sendMoneyMovementsImpl;
	
	@Before
	public void init(){
		sendMoneyMovementsImpl = new SendMoneyMovementsImpl();
	}
	
	@Test
	public void sendTransactionFlapTest(){
		NotResponse res = sendMoneyMovementsImpl.petitionPost(
												"http://localhost:8080/", 
												"zic/sendMoneyMovements/V03/sendTransactionFlap");
		
		Assert.assertEquals(null, res);
	}
}
