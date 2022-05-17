package pt.nunofern.queueconsumers.model;

import java.util.Date;

public record ApproveInvoicePayload (
    Long docRevisionId,
    String fileName,
    String approver,
    Date approvedDate,
    String numFatura,
    String nifCliente
) {}
