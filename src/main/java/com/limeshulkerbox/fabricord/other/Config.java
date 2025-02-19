package com.limeshulkerbox.fabricord.other;

import blue.endless.jankson.annotation.SerializedName;
import lombok.Data;

@Data
public class Config {

    @SerializedName("config_version")
    private int configVersion;

    @SerializedName("bot_token")
    private String botToken;

    @SerializedName("commands_access_roles_id")
    private String commandsAccessRoleID;

    @SerializedName("update_bot_status_every")
    private int updateBotStatusEvery;


    @SerializedName("chat_enabled")
    private boolean chatEnabled;

    @SerializedName("chat_channel_id")
    private String chatChannelID;

    @SerializedName("commands_in_chat_channel")
    private boolean commandsInChatChannel;

    @SerializedName("prompt_enabled")
    private boolean promptsEnabled;


    @SerializedName("console_enabled")
    private boolean consoleEnabled;

    @SerializedName("console_channel_id")
    private String consoleChannelID;

    @SerializedName("show_debug_logs_in_console")
    private boolean showDebugLogsInConsole;

    @SerializedName("show_error_logs_in_console")
    private boolean showErrorLogsInConsole;

    @SerializedName("show_warn_logs_in_console")
    private boolean showWarnLogsInConsole;

    @SerializedName("show_info_logs_in_console")
    private boolean showInfoLogsInConsole;


    @SerializedName("webhooks_enabled")
    private boolean webhooksEnabled;

    @SerializedName("only_webhooks")
    private boolean onlyWebhooks;

    @SerializedName("webhook_url")
    private String webhookURL;


    @SerializedName("server_starting_prompt")
    private String serverStartingPrompt;

    @SerializedName("server_started_prompt")
    private String serverStartedPrompt;

    @SerializedName("server_stopping_prompt")
    private String serverStoppingPrompt;

    @SerializedName("server_stopped_prompt")
    private String serverStoppedPrompt;


    @SerializedName("send_wrong_channel_message")
    private boolean sendWrongChannelMessage;
    @SerializedName("send_discriminator_to_minecraft")
    private boolean sendDiscriminatorToMinecraft;


    @SerializedName("console_buffer_enabled")
    private boolean consoleBufferEnabled;
    @SerializedName("console_buffer_amount")
    private int consoleBufferAmount;

    public Config(int configversion,
                  String botToken,
                  String commandsAccessRoleID,
                  int updateBotStatusEvery,

                  boolean chatEnabled,
                  String chatChannelID,
                  boolean commandsInChatChannel,
                  boolean sendWrongChannelMessage,
                  boolean promptsEnabled,

                  boolean consoleEnabled,
                  String consoleChannelID,
                  boolean showInfoLogsInConsole,
                  boolean showWarnLogsInConsole,
                  boolean showErrorLogsInConsole,
                  boolean showDebugLogsInConsole,

                  boolean webhooksEnabled,
                  boolean onlyWebhooks,
                  String webhookURL,

                  String serverStartingPrompt,
                  String serverStartedPrompt,
                  String serverStoppingPrompt,
                  String serverStoppedPrompt,

                  boolean sendDiscriminatorToMinecraft,

                  boolean consoleBufferEnabled,
                  int consoleBufferAmount) {

        this.configVersion = configversion;

        this.botToken = botToken;
        this.commandsAccessRoleID = commandsAccessRoleID;
        this.updateBotStatusEvery = updateBotStatusEvery;

        this.chatEnabled = chatEnabled;
        this.chatChannelID = chatChannelID;
        this.commandsInChatChannel = commandsInChatChannel;
        this.sendWrongChannelMessage = sendWrongChannelMessage;
        this.promptsEnabled = promptsEnabled;

        this.consoleEnabled = consoleEnabled;
        this.consoleChannelID = consoleChannelID;
        this.showDebugLogsInConsole = showDebugLogsInConsole;
        this.showErrorLogsInConsole = showErrorLogsInConsole;
        this.showWarnLogsInConsole = showWarnLogsInConsole;
        this.showInfoLogsInConsole = showInfoLogsInConsole;

        this.webhooksEnabled = webhooksEnabled;
        this.onlyWebhooks = onlyWebhooks;
        this.webhookURL = webhookURL;

        this.serverStartingPrompt = serverStartingPrompt;
        this.serverStartedPrompt = serverStartedPrompt;
        this.serverStoppingPrompt = serverStoppingPrompt;
        this.serverStoppedPrompt = serverStoppedPrompt;

        this.sendDiscriminatorToMinecraft = sendDiscriminatorToMinecraft;

        this.consoleBufferEnabled = consoleBufferEnabled;
        this.consoleBufferAmount = consoleBufferAmount;
    }

    public Config() {

    }
}